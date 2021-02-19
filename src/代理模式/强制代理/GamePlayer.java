package 代理模式.强制代理;

/**
 * @author zheng
 * @description 强制代理的真实角色
 * @date 2021/1/29
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    /**
     * 我的代理是谁
     *
     * @param user
     * @param password
     */
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
        } else {
            System.out.println("请使用代理类访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "正在打怪");
        } else {
            System.out.println("请使用代理类访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级");
        } else {
            System.out.println("请使用代理类访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 校验是否是代理访问
     *
     * @return
     */
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
