package 代理模式;

/**
 * @author zheng
 * @description 游戏者接口
 * @date 2021/1/29
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();
}
