package 代理模式.普通代理;

import 代理模式.IGamePlayer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zheng
 * @description 在普通模式下，调用者只知道代理而不知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响
 * @date 2021/1/29
 */
public class Client {
    public static void main(String[] args) {
        //代练
        IGamePlayer proxy = new GamePlayerProxy("张三");

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("开始时间是: " + sf.format(new Date()));

        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间是:" + sf.format(new Date()));
    }
}
