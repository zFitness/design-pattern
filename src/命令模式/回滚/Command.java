package 命令模式.回滚;



/**
 * @author zheng
 * @description 抽象命令类
 * @date 2021/2/3
 */
public abstract class Command {
    /**
     * 把三个组定义好
     */
    protected PageGroup pg = new PageGroup();

    /**
     * 只有一个方法，你要我做什么事情
     */
    public abstract void execute();
}
