package 策略模式.三国案例;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找吴国太帮忙开绿灯");
    }
}
