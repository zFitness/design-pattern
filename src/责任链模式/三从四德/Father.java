package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 父亲类
 * @date 2021/2/4
 */
public class Father implements IHandler {
    /**
     * 未出嫁的女儿请示父亲
     *
     * @param women
     */
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
