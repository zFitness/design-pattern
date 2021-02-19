package 命令模式.旅行社项目命令模式;

/**
 * @author zheng
 * @description 增加需求的命令
 * @date 2021/2/3
 */
public class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }
}
