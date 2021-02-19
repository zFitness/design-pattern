package 模板方法模式;

/**
 * @author zheng
 * @description H2 型号悍马
 * @date 2021/1/27
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2 启动");
    }

    @Override
    protected void stop() {
        System.out.println("H2 停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2 引擎启动");
    }

    /**
     * 重写钩子方法, 不响喇叭
     *
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
