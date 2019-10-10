package classical;

/**
 * @author yanyuchi
 * @date 2019-04-28 20:30
 * @notice: 如果多线程执行，还是可能会产生多个实例
 */
public class Singleton {
    /**
     *  利用一个静态变量来记录Singleton类的唯一实例
     */
    private static Singleton uniqueInstance;


    /**
     * 构造器声明为私有的,只有Singleton内才能使用
     */
    private Singleton(){

    }

    /**
     * @ps:这种写法叫延迟实例化
     * @return
     */
    private static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
