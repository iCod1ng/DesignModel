package eagerly;

/**
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
