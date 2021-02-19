package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 车辆模型的抽象类
 * @date 2021/1/28
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        //循环一边， 谁在前，就执行谁
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if ("start".equalsIgnoreCase(actionName)) {
                this.start();
            } else if ("stop".equalsIgnoreCase(actionName)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                this.alarm();
            } else if ("engine boom".equalsIgnoreCase(actionName)) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;

    }
}
