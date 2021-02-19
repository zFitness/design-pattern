package 迭代器模式;

/**
 * @author zheng
 * @description 项目信息接口
 * @date 2021/2/8
 */
public interface IProject {
    /**
     * 从老板这里看到的就是项目信息
     *
     * @return
     */
    String getProjectInfo();

    /**
     * 增加项目
     *
     * @param name
     * @param num
     * @param cost
     */
    void add(String name, int num, int cost);

    /**
     * 获得一个可以被遍历的对象
     *
     * @return
     */
    IProjectIterator iterator();
}
