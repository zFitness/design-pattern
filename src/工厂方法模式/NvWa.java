package 工厂方法模式;

import 工厂方法模式.简单工厂模式.HumanSimpleFactory;

/**
 * @author zheng
 * @description 女娲场景类
 * @date 2021/1/26
 */
public class NvWa {
    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory yinYangLu = new HumanFactory();

        //第一次造人，经验不足，
        System.out.println("--造出来的是白人--");
        WhiteHuman whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //第二次造人，火候大了
        System.out.println("\n--造出来的是黑人--");
        BlackHuman blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        //第三次造人，火候刚刚好
        System.out.println("\n--造出来的是黄人--");
        YellowHuman yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


        //使用简单工厂模式造人
        System.out.println("\n--简单工厂模式造出来的是黄人--");
        BlackHuman blackHuman1 = HumanSimpleFactory.createHuman(BlackHuman.class);
        blackHuman1.getColor();
        blackHuman1.talk();
    }
}
