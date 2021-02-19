package 责任链模式.三从四德责任链;

import 责任链模式.三从四德.IWomen;

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
        //为了便于显示，在这里做点处理
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是；" + request;
                break;
        }

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
