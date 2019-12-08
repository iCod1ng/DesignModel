package practice.mybatis.JDKProxy;

import practice.mybatis.DbTools;
import practice.mybatis.annotation.Select;
import practice.mybatis.entity.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author yanyuchi
 * @date 2019-12-08 19:23
 */
public class MapperProxy implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) {
        Class<?> returnType = method.getReturnType();
        System.out.println("进入MapperProxy的invoke啦");
        if(method.isAnnotationPresent(Select.class)){
            Select select = method.getAnnotation(Select.class);
            String sql = select.value();
            System.out.println("sql语句: "+sql);
            System.out.println("返回值类型: "+returnType);
            return selectOne(sql,returnType,args);

        }
        return new User(1,"罗小黑","634844669@qq.com");
    }

    private <T> T selectOne(String sql,Class<T> returnType,Object ...args){
        List<T> list = selectList(sql,returnType,args);
        if(list == null){
            return null;
        }
        return list.get(0);
    }

    private <T> List<T> selectList(String sql,Class<T> returnType,Object ...args){
        return DbTools.executeQuery(sql,returnType,args);
    }
}
