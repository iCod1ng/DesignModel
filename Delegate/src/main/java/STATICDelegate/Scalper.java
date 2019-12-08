package STATICDelegate;

/**
 * @author yanyuchi
 * @date 2019-12-08 17:01
 * 代理对象：黄牛
 */
public class Scalper implements Ticket{

    private Myself customer; //黄牛持有看顾客的引用，操作买票的黄牛，实际是顾客

    public  Scalper(Myself customer){
        this.customer = customer;
    }

    public void buyTicket() {
        System.out.println("黄牛拿到顾客信息去买票");
        customer.buyTicket();  //实际购票人是自己
        System.out.println("黄牛购票成功");
    }
}
