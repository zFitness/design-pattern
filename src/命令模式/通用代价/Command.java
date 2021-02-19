package 命令模式.通用代价;

/**
 * @author zheng
 * @description 抽象的 command 类
 * @date 2021/2/3
 */
public abstract class Command {
    /**
     * 每个命令类都必须有一个执行命令的方法
     */
    public abstract void execute();
}
