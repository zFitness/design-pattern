package 迭代器模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 项目信息的实现
 * @date 2021/2/8
 */
public class Project implements IProject {
    /**
     * 项目名称
     */
    private String name = "";

    /**
     * 项目成员数量
     */
    private int num = 0;

    /**
     * 定义一个项目列表， 所有的项目都放在这里
     */
    private final ArrayList<IProject> projectList = new ArrayList<>();


    /**
     * 项目费用
     */
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    /**
     * 得到项目信息
     *
     * @return
     */
    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是：" + this.name;
        info = info + "\t项目名称是" + this.num;
        info = info + "\t 项目费用" + this.cost;
        return info;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIt;
    }
}
