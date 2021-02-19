package 设计原则.依赖倒置原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Benz implements ICar{
    @Override
    public void run() {
        System.out.println("奔驰开始跑了");
    }
}
