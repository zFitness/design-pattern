package 设计原则.接口隔离原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public abstract class AbstractSearcher {
    private IPettyGirl pettyGirl;


    public AbstractSearcher(IPettyGirl iPettyGirl) {
        this.pettyGirl = iPettyGirl;
    }

    public abstract void show();

    public IPettyGirl getPettyGirl() {
        return pettyGirl;
    }

    public void setPettyGirl(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }
}
