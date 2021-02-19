package 单例模式;

/**
 * @author zheng
 * @description 懒汉式， 线程不安全， 使用时才创建
 * @date 2021/1/26
 */
public class Singleton2 {
    private static Singleton2 singleton;

    /**
     * 限制多个对象
     */
    private Singleton2() {

    }

    /**
     * 通过该方法获得实例对象
     */
    public static Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    /**
     * 类中其他方法，尽量是 static
     */
    public static void doSomething() {

    }

}
