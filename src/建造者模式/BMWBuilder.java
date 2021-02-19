package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 宝马车组装者
 * @date 2021/1/28
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequnce(ArrayList<String> sequnce) {
        this.bmwModel.setSequence(sequnce);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
