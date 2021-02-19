package 责任链模式.三从四德责任链;


import 责任链模式.三从四德.IWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zheng
 * @description TODO
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

        //定义三个请求处理对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请求顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }
}
