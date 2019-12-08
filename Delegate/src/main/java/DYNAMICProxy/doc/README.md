* 生成的 $Proxy 代理类继承了 Proxy 类，实现了代理接口
* 生成的代理类，实行目标方法相当于调用的是 InvocationHandler 接口的 invoke 方法
* 由于 Java 不能多继承，这里已经继承了 Proxy 类了，不能再继承其他的类，所以 JDK 的动态代理不支持对实现类的代理，只支持接口的代理。