package 命令模式.旅行社项目;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/2/3
 */
public class Client {
    public static void main(String[] args) {
        //过来谈需求
        System.out.println("----客户要求修改需求----");

        Group rg = new RequirementGroup();

        //找的需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();

        //过来谈页面
        System.out.println("----客户要求修改页面----");

        Group rg1 = new PageGroup();

        //找的需求组
        rg1.find();
        //增加一个需求
        rg1.add();
        //要求变更计划
        rg1.plan();



    }
}
