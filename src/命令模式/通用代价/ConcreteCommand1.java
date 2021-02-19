package 命令模式.通用代价;

/**
 * @author zheng
 * @description 抽象的 Command 类
 * @date 2021/2/3
 */
public class ConcreteCommand1 extends Command {
    /**
     * 对哪个 Receiver receiver
     */
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
