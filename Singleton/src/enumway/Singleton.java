package enumway;

/**
 * 枚举方式单例，简单且不会被破坏单例性。
 * 其他方式的单例，反序列可能会破坏单例。
 * http://www.hollischuang.com/archives/2498
 */
public enum Singleton {
    INSTANCE;
    public void doSomething(){

    }

    public static void main(String[] args) {
        Singleton.INSTANCE.doSomething();
    }
}
