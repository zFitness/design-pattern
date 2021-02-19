package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 奔驰车组装者
 * @date 2021/1/28
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequnce(ArrayList<String> sequnce) {
        this.benzModel.setSequence(sequnce);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
