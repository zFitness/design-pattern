package 责任链模式.三从四德责任链;

import 责任链模式.三从四德.IWomen;

/**
 * @author zheng
 * @description 丈夫类
 * @date 2021/2/4
 */
public class Son extends Handler {
    /**
     * 丈夫只处理妻子的请求
     *
     */
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n----母亲向儿子请示----\n");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
