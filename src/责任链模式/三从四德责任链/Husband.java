package 责任链模式.三从四德责任链;

import 责任链模式.三从四德.IWomen;

/**
 * @author zheng
 * @description 丈夫类
 * @date 2021/2/4
 */
public class Husband extends Handler {
    /**
     * 丈夫只处理妻子的请求
     */
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n----妻子向丈夫请示----\n");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
