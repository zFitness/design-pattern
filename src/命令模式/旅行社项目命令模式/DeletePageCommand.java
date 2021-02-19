package 命令模式.旅行社项目命令模式;

/**
 * @author zheng
 * @description 删除页面的命令
 * @date 2021/2/3
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        //找到页面组
        super.pg.find();
        //删除一个页面
        super.pg.delete();
        //给出计划
        super.pg.plan();

    }
}
