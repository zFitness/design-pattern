package 工厂方法模式.延迟初始化;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class ProductFactory {
    public static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) {
        Product product = null;

        //如果 Map 中已经有了这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type, product);
        }

        return product;
    }
}
