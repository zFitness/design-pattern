package 命令模式.旅行社项目命令模式;

/**
 * @author zheng
 * @description 负责人
 * @date 2021/2/3
 */
public class Invoker {
    /**
     * 什么命令
     */
    private Command command;

    /**
     * 客户发出命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户命令
     */
    public void action() {
        this.command.execute();
    }

}
