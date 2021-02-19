package 迭代器模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 项目迭代器
 * @date 2021/2/8
 */
public class ProjectIterator implements IProjectIterator {
    /**
     * 把所有项目都放在 ArrayList 中
     *
     * @return
     */
    private ArrayList<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }


    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() ) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }


}
