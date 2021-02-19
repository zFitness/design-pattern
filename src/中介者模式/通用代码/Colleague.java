package 中介者模式.通用代码;

/**
 * @author zheng
 * @description 抽象同事类
 * @date 2021/2/3
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
