package 建造者模式;

import java.util.ArrayList;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/1/28
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 客户需要的模型
         */
        BenzModel benzModel = new BenzModel();
        //存放 run 的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        //
        benzModel.setSequence(sequence);
        benzModel.run();


        //使用构造者进行构建
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequnce(sequence);
        CarModel carModel = benzBuilder.getCarModel();
        carModel.run();

        // 使用导演类
        Director director = new Director();
        BenzModel aBenzModel = director.getABenzModel();
        aBenzModel.run();
    }
}
