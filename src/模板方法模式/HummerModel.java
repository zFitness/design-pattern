package 模板方法模式;

/**
 * @author zheng
 * @description 悍马模型类
 * @date 2021/1/27
 */
public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    /**
     * 模板方法，实现对基本方法的调度，加 final 防止被覆写
     */
    public final void run() {
        this.start();
        this.engineBoom();

        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法，默认喇叭会响
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
