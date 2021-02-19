package 中介者模式.修改进销存;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/1
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购IBM电脑
     *
     * @param number
     */
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    /**
     * 不再采购IBM电脑
     */
    public void refuseBuyIBM() {
        System.out.println("不再采购 IBM 电脑");
    }
}
