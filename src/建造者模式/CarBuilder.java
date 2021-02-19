package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 抽象汽车组装者
 * @date 2021/1/28
 */
public abstract class CarBuilder {
    /**
     * 建造一个模型， 你要给我一个顺序要求，就是组装顺序
     *
     * @param sequnce
     */
    public abstract void setSequnce(ArrayList<String> sequnce);

    /**
     * 设置完毕顺序后， 就可以直接拿到汽车模型
     */
    public abstract CarModel getCarModel();
}
