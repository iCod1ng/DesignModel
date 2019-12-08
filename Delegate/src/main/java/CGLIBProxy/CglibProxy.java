package CGLIBProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yanyuchi
 * @date 2019-12-08 18:51
 */
public class CglibProxy implements MethodInterceptor {
    /**
     *
     * @param o 目标类的实例
     * @param method  目标方法实例（通过反射获取的目标方法实例）
     * @param objects 目标方法参数
     * @param methodProxy 代理类实例
     * @return
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("====Cglib动态代理开始====");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("====Cglib动态代理结束====");
        return result;
    }
}
