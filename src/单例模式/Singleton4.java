package 单例模式;

/**
 * @author zheng
 * @description 懒汉式， 线程安全， 使用时才创建,
 * 登记式/静态内部类
 * @date 2021/1/26
 */
public class Singleton4 {
    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private static Singleton4 singleton;

    /**
     * 限制多个对象
     */
    private Singleton4() {

    }

    /**
     * 通过该方法获得实例对象
     */
    public static Singleton4 getSingleton() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 类中其他方法，尽量是 static
     */
    public static void doSomething() {

    }

}
