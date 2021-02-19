package 建造者模式;

/**
 * @author zheng
 * @description 宝马
 * @date 2021/1/28
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车引擎启动");
    }
}
