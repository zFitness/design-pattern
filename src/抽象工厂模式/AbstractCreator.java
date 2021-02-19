package 抽象工厂模式;

/**
 * @author zheng
 * @description 抽象工厂类
 * 有 M 个产品等级就应该有 M 个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务
 * @date 2021/1/27
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品 B
     */
    public abstract AbstractProductB createProductB();
}
