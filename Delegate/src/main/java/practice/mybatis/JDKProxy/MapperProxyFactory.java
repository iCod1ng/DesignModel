package practice.mybatis.JDKProxy;

import java.lang.reflect.Proxy;

/**
 * @author yanyuchi
 * @date 2019-12-08 19:23
 * 实例化代理的工具类
 */
public class MapperProxyFactory {

    public static <T> T getMapper(Class<T> mapperInterface){
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(),new Class[] {mapperInterface},new MapperProxy());

    }
}
