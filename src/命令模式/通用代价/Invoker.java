package 命令模式.通用代价;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/3
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }


}
