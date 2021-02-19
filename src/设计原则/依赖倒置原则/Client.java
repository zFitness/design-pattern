package 设计原则.依赖倒置原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Client {
    public static void main(String[] args) {
        Driver zs = new Driver();
        Benz benz = new Benz();
        BMW bmw = new BMW();

        zs.driver(benz);
        zs.driver(bmw);
    }
}
