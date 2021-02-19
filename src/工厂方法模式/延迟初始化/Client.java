package 工厂方法模式.延迟初始化;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Product product1 = ProductFactory.createProduct("Product1");
            Product product2 = ProductFactory.createProduct("Product2");
            System.out.println(product1);
            System.out.println(product2);
        }
    }
}
