package 命令模式.旅行社项目命令模式;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/2/3
 */
public class Client {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker invoker = new Invoker();
        //客户要求增加一项需求
        System.out.println("----客户要求增加一项需求----");
        //客户给我们下命令
        Command command = new AddRequirementCommand();
        //接头人收到命令
        invoker.setCommand(command);
        //接头人执行命令
        invoker.action();

        System.out.println("----客户要求删除一个页面----");
        //客户给我们下命令
        Command command1 = new DeletePageCommand();
        //接头人收到命令
        invoker.setCommand(command1);
        //接头人执行命令
        invoker.action();
    }
}
