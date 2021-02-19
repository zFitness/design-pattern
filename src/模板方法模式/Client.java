package 模板方法模式;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/1/27
 */
public class Client {
    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.run();

        hummerH1Model.setAlarm(false);
        hummerH1Model.run();
    }
}
