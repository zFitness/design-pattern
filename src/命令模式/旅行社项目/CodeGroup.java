package 命令模式.旅行社项目;

/**
 * @author zheng
 * @description 代码组
 * @date 2021/2/3
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求修改一项需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
