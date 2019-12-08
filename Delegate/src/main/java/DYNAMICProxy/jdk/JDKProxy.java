package DYNAMICProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:27
 */
public class JDKProxy implements InvocationHandler {

    private Object target; //目标对象

    public JDKProxy(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("====动态代理开始=====");
        Object result = method.invoke(target,args);
        System.out.println("====动态代理结束=====");
        return result;
    }
}
