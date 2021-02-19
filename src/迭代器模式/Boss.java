package 迭代器模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 老大看报表的场景
 * @date 2021/2/8
 */
public class Boss {
    public static void main(String[] args) {
        // 定义一个 List, 存放所有的项目对象
        ArrayList<IProject> projectList = new ArrayList<>();
        // 增加星球大战项目
        projectList.add(new Project("星球大战项目", 10, 10000));
        //增加逆转时空项目
        projectList.add(new Project("逆转时空项目", 101, 1000000));
        //增加超人改造项目
        projectList.add(new Project("超人改造项目", 31, 2342342));

        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 100));
        }

//        for (IProject iProject : projectList) {
//            System.out.println(iProject.getProjectInfo());
//        }


        //迭代器模式使用
        IProject project = new Project();
        // 增加星球大战项目
        project.add("星球大战项目", 10, 10000);
        //增加逆转时空项目
        project.add("逆转时空项目", 101, 1000000);
        //增加超人改造项目
        project.add("超人改造项目", 31, 2342342);

        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 100);
        }

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
