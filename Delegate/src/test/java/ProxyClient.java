import STATICProxy.Myself;
import STATICProxy.Scalper;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:06
 */
public class ProxyClient {
    public static void main(String[] args) {
        Scalper scalper = new Scalper(new Myself());
        scalper.buyTicket();
    }

}
