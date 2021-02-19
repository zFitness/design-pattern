package 工厂方法模式.替代单例模式;

import java.lang.reflect.Constructor;

/**
 * @author zheng
 * @description 饿汉式，使用工厂实现单例模式
 * @date 2021/1/26
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> cl = Class.forName(Singleton.class.getName());
            //获取无参构造
            Constructor<?> constructor = cl.getDeclaredConstructor();
            //设置无参构造可以访问
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
