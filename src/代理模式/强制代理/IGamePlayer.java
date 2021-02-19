package 代理模式.强制代理;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/29
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();

    /**
     * 每个人必须找自己的代理
     * @return
     */
    IGamePlayer getProxy();
}
