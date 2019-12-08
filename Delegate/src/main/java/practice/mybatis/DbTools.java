package practice.mybatis;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author yanyuchi
 * @date 2019-12-08 19:18
 */
public class DbTools {
    private static DruidDataSource dataSource;

    static{
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("juicebar");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mmal");
        dataSource.setInitialSize(5);
        dataSource.setMinIdle(1);
        dataSource.setMaxActive(10);
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static int executeUpdate(String sql, Object ...args){
        try {
            return executeUpdate(getConnection(),sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 增、删、改操作
     * @param connection
     * @param sql
     * @param args
     * @return
     * @throws SQLException
     */
    public static int executeUpdate(Connection connection,String sql, Object ...args) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int i = 1;
        for (Object arg : args) {
            preparedStatement.setObject(i,arg);
            i++;
        }
        return preparedStatement.executeUpdate();
    }

    /**
     * 查询操作
     * @param sql
     * @param classType
     * @param args
     * @param <T>
     * @return
     */
    public static <T> List<T> executeQuery(String sql, Class<T> classType, Object ...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            int i = 1;
            for (Object arg : args) {
                preparedStatement.setObject(i,arg);
                i++;
            }
            resultSet = preparedStatement.executeQuery();
            return setMetaData(resultSet,classType);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            release(connection,preparedStatement,resultSet);
        }
        return new ArrayList<T>();
    }

    /**
     * 释放资源
     * @param connection
     * @param preparedStatement
     * @param resultSet
     */
    public static void release(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(preparedStatement != null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 反射将数据库结果转换为实体类
     * @param rs
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T> List<T> setMetaData(ResultSet rs, Class<T> clazz) throws Exception {
        List<T> tList = new ArrayList<T>();
        while (rs.next()) {
            T t = clazz.newInstance();
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            for (int i = 1; i <= count; i++) {
                String name = rsmd.getColumnName(i);
                Field field = clazz.getDeclaredField(name);
                field.setAccessible(true);
                field.set(t, rs.getObject(name));
            }
            tList.add(t);
        }
        return tList;
    }
}
