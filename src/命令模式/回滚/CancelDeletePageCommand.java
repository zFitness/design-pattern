package 命令模式.回滚;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/3
 */
public class CancelDeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.rollBack();
    }
}
