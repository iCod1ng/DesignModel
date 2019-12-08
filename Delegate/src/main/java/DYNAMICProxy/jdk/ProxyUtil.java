package DYNAMICProxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:31
 * 通过Proxy类的newProxyInstance实例化代理类
 */
public class ProxyUtil {
    public static <T> T getProxy(Object target){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new JDKProxy(target));
    }
}
