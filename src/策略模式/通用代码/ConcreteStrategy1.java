package 策略模式.通用代码;

/**
 * @author zheng
 * @description 具体策略角色
 * @date 2021/2/6
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
