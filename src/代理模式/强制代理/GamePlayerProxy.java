package 代理模式.强制代理;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/29
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    /**
     * 代理的代理就是自己
     *
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
