package 单例模式;

/**
 * @author zheng
 * @description 懒汉式， 线程安全， 使用时才创建,
 * 使用 synchronized 保证线程安全
 * @date 2021/1/26
 */
public class Singleton3 {
    private static Singleton3 singleton;

    /**
     * 限制多个对象
     */
    private Singleton3() {

    }

    /**
     * 通过该方法获得实例对象
     */
    public static synchronized Singleton3 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton3();
        }
        return singleton;
    }

    /**
     * 类中其他方法，尽量是 static
     */
    public static void doSomething() {

    }

}
