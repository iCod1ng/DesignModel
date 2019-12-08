package DYNAMICProxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yanyuchi
 * @date 2019-12-08 18:57
 * 生成CGLIB代理对象
 */
public class CglibProxyUtil {
    public static <T> T  getCglibProxy(Object o){
        Enhancer enhancer = new Enhancer();
        //设置代理类的父类
        enhancer.setSuperclass(o.getClass());
        //设置回调方法
        enhancer.setCallback(new CglibProxy());
        //创建代理对象
        return (T) enhancer.create();
    }
}
