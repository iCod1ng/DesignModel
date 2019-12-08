package practice.mybatis.JDKProxy;

import practice.mybatis.entity.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yanyuchi
 * @date 2019-12-08 19:23
 */
public class MapperProxy implements InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("进入MapperProxy的invoke啦");
        return new User(1,"罗小黑","634844669@qq.com");
    }
}
