package 单例模式;

/**
 * @author zheng
 * @description 皇帝类， 饿汉模式（线程安全）, 系统加载就创建
 * @date 2021/1/26
 */
public class Emperor {
    /**
     * 初始化一个皇帝
     */
    private static final Emperor emperor = new Emperor();

    /**
     * 私有构造器, 目的是只有一个皇帝
     * 其他类无法 new一个对象，自己则可以 new
     */
    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝哈哈哈...");
    }

}
