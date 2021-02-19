package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 丈夫类
 * @date 2021/2/4
 */
public class Husband implements IHandler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
