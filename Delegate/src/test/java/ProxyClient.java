import DYNAMICProxy.jdk.ProxyUtil;
import STATICProxy.Myself;
import STATICProxy.Scalper;
import STATICProxy.Ticket;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:06
 */
public class ProxyClient {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Ticket myself = ProxyUtil.getProxy(new Myself()); //获取到一个$Proxy开头的代理类
        myself.buyTicket();  //调用目标方法，实际调用代理类的invoke方法
        //代理类实现了接口，接口方法内调用super.h.invoke =>调用代理类的 buyTicket 方法相当于是调用 InvocationHandler 的 invoke 方法
        //dynamicProxyByJDK();
    }


    /**
     * 静态代理
     */
    private static  void  staticProxy(){
        Scalper scalper = new Scalper(new Myself());
        scalper.buyTicket();
    }


    /**
     * 动态代理JDKWay
     */
    private static  void dynamicProxyByJDK(){
        Ticket myself = ProxyUtil.getProxy(new Myself());
        myself.buyTicket();
    }

}
