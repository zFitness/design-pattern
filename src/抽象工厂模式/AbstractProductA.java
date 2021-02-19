package 抽象工厂模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/27
 */
public abstract class AbstractProductA {
    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {

    }

    /**
     * 每个产品相同方法，不同实现
     */
    public abstract void doSomething();
}
