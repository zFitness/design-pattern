package 代理模式.动态代理;

import 代理模式.GamePlayer;
import 代理模式.GamePlayerProxy;
import 代理模式.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
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

        // 动态代理
        InvocationHandler handler = new GamePlayIH(player);

        System.out.println("开始时间是: " + sf.format(new Date()));
        // 获得类的 ClassLoader
        ClassLoader cl = Client.class.getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(
                player.getClass().getClassLoader(),  //1. 类加载器
                new Class<?>[]{IGamePlayer.class},   //2. 代理需要实现的接口， 也可以写成: player.getClass.getInterfaces
                handler);   //3. 方法调用的实际处理者

        proxy.login("zs", "xjdfjajf");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("结束时间是:" + sf.format(new Date()));
    }
}
