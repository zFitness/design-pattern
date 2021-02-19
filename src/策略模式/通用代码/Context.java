package 策略模式.通用代码;

/**
 * @author zheng
 * @description 封装角色
 * @date 2021/2/6
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
