package 命令模式.旅行社项目命令模式;

import 命令模式.旅行社项目.CodeGroup;
import 命令模式.旅行社项目.PageGroup;
import 命令模式.旅行社项目.RequirementGroup;

/**
 * @author zheng
 * @description 抽象命令类
 * @date 2021/2/3
 */
public abstract class Command {
    /**
     * 把三个组定义好
     */
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法，你要我做什么事情
     */
    public abstract void execute();
}
