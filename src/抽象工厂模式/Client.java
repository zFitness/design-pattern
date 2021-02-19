package 抽象工厂模式;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/1/27
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //产生 A1 对象
        AbstractProductA a1 = creator1.createProductA();
        //产生 A2 对象
        AbstractProductA a2 = creator2.createProductA();
    }
}
