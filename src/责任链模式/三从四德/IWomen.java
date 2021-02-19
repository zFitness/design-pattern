package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 女性接口
 * @date 2021/2/4
 */
public interface IWomen {
    /**
     * 获得个人状况
     * @return
     */
    public int getType();

    /**
     * 获得个人请示，你要干什么？出去逛街？约会？还是看电影
     * @return
     */
    public String getRequest();
}
