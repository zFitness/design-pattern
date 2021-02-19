package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 导演类
 * @date 2021/1/28
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A 类型的奔驰车模型，先 start,
     */
    public BenzModel getABenzModel() {
        // 防止数据混乱
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequnce(sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

}
