package eagerly;

/**
 * Eagerly Singleton(应用总是创建单例实例，或者创建和运行开销小时使用，无线程安全问题)
 * @author yanyuchi
 * @date 2019-04-28 21:15
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
