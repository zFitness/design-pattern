package 中介者模式.修改进销存;

/**
 * @author zheng
 * @description 抽象同事类
 * @date 2021/2/1
 */
public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
