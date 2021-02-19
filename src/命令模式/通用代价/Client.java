package 命令模式.通用代价;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/3
 */
public class Client {
    public static void main(String[] args) {
        //首先声明调用者 Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReceiver1();

        //定义一个发送给接收者的命令
        Command command = new ConcreteCommand1(receiver);

        //把命令给调用者执行
        invoker.setCommand(command);
        invoker.action();
    }
}
