package 工厂方法模式.延迟初始化;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class ConcreteProduct1 implements Product{
    @Override
    public void doSomething() {
        System.out.println("产品1");
    }
}
