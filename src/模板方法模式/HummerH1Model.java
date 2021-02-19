package 模板方法模式;

/**
 * @author zheng
 * @description H1 型号悍马
 * @date 2021/1/27
 */
public class HummerH1Model extends HummerModel {
    /**
     * 响喇叭
     */
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("H1 启动");
    }

    @Override
    protected void stop() {
        System.out.println("H1 停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 引擎启动");
    }

    /**
     * 重写钩子方法
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    /**
     * 要不要响喇叭，是由客户端来决定的
     */
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
