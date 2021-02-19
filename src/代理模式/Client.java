package 代理模式;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/1/29
 */
public class Client {
    public static void main(String[] args) {
        //玩家
        IGamePlayer player = new GamePlayer("张三");

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        //定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);


        System.out.println("开始时间是: " + sf.format(new Date()));

        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间是:" + sf.format(new Date()));
    }
}
