import DYNAMICProxy.cglib.CglibProxyUtil;
import DYNAMICProxy.jdk.ProxyUtil;
import STATICProxy.Myself;
import STATICProxy.Scalper;
import STATICProxy.Ticket;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:06
 */
public class ProxyClient {
    public static void main(String[] args) {
        dynamicProxyByCglib();
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
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Ticket myself = ProxyUtil.getProxy(new Myself());
        myself.buyTicket();
    }

    private static void dynamicProxyByCglib(){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\project\\designModel\\DesignModel");
        Myself myself = CglibProxyUtil.getCglibProxy(new Myself());
        myself.buyTicket();
    }

}
