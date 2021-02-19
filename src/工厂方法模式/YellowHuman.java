package 工厂方法模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色人种肤色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话哈哈哈");
    }
}
