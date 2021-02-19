package 代理模式.强制代理;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/29
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        GamePlayer player = new GamePlayer("张三");

        //无法直接使用角色
        player.login("zs", "xxx");

        //使用代理类访问
        IGamePlayer proxy = player.getProxy();
        proxy.login("zs", "xxx");
    }
}
