package 设计原则.依赖倒置原则;

/**
 * @author zheng
 * @description 宝马车
 * @date 2021/1/25
 */
public class BMW implements ICar{
    @Override
    public void run() {
        System.out.println("宝马车开始跑了...");
    }
}
