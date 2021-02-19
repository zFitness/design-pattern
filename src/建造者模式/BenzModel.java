package 建造者模式;

/**
 * @author zheng
 * @description 奔驰
 * @date 2021/1/28
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎启动");
    }
}
