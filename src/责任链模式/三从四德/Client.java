package 责任链模式.三从四德;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/2/4
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();

        ArrayList<IWomen> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        //定义三个请求对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                //未结婚，请求父亲
                System.out.println("\n----女儿向父亲请示----\n");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                //已婚少妇，请求丈夫
                System.out.println("\n----妻子向丈夫请示----\n");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                // 母亲请示儿子
                System.out.println("\n----母亲向儿子请示----\n");
                son.handleMessage(women);
            } else {

            }
        }
    }
}
