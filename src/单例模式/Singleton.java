package 单例模式;

/**
 * @author zheng
 * @description 饿汉式， 线程安全， 系统启动时就创建
 * @date 2021/1/26
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    /**
     * 限制多个对象
     */
    private Singleton() {

    }

    /**
     * 通过该方法获得实例对象
     */
    public static Singleton getSingleton() {
        return singleton;
    }

    /**
     * 类中其他方法，尽量是 static
     */
    public static void doSomething() {

    }

}
