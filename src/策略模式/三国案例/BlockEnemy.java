package 策略模式.三国案例;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找孙夫人帮忙断后");
    }
}
