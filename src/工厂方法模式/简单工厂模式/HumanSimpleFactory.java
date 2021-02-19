package 工厂方法模式.简单工厂模式;

import 工厂方法模式.Human;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class HumanSimpleFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
