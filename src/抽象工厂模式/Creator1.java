package 抽象工厂模式;

/**
 * @author zheng
 * @description 产品等级1的实现类
 * @date 2021/1/27
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
