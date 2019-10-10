package multithread;

/**
 * @author yanyuchi
 * @date 2019-04-28 21:01
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){

    }

    /**
     * 转同步方法，解决多线程问题
     * 每个线程进入这个方法前，要等待别的线程离开这个方法
     * @return
     */
    public static synchronized  Singleton getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

}
