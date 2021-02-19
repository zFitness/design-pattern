package 工厂方法模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂");
    }
}
