package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 儿子类
 * @date 2021/2/4
 */
public class Son implements IHandler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
