package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 古代妇女
 * @date 2021/2/4
 */
public class Women implements IWomen {
    /**
     * 通过一个 int 类型的参数来描述妇女的个人情况
     * 1 ---- 未出嫁
     * 2 ---- 出嫁
     * 3 ---- 丈夫
     */
    private int type = 0;

    /**
     * 妇女的请示
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
