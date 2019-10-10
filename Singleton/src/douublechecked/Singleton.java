package douublechecked;

/**
 * @author yanyuchi
 * @date 2019-04-28 21:17
 * @description:双重检查加锁:首先检查是否实例已经创建了，如果尚未创建，“才”进行同步。
 * @notice：仅支持1.5后
 */
public class Singleton {


    /**
     * volatile关键字确保：当uniqueInstance变量被初始化成Singleton时，多个线程正确地处理uniqueInstance变量
     */
    private volatile  static Singleton uniqueInstance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
