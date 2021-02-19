package 命令模式.通用代价;

/**
 * @author zheng
 * @description 通用 Receiver 类
 * @date 2021/2/3
 */
public abstract class Receiver {
    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     */
    public abstract void doSomething();
}
