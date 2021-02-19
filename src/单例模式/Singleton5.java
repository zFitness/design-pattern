package 单例模式;

/**
 * @author zheng
 * @description 饿汉式， 线程安全，
 * 枚举实现
 * @date 2021/1/26
 */
public enum Singleton5 {
    /**
     * 使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
     */
    INSTANCE;

    public void doSth() {
        System.out.println("枚举实现单例");
    }

    public static void main(String[] args) {
        Singleton5 si = Singleton5.INSTANCE;
        si.doSth();
    }
}
