package 责任链模式.三从四德责任链;

import 责任链模式.三从四德.IWomen;

/**
 * @author zheng
 * @description 父亲类
 * @date 2021/2/4
 */
public class Father extends Handler {
    /**
     * 父亲只处理女儿的请求
     */
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("\n----女儿向父亲请示----\n");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
