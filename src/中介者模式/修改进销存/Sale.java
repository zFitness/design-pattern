package 中介者模式.修改进销存;

import 中介者模式.原始进销存.Purchase;
import 中介者模式.原始进销存.Stock;

import java.util.Random;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/1
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 出售IBM电脑
     *
     * @param number
     */
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    /**
     * 反馈销售情况, 0~100之间变化，0代表没有人卖，100代表非常畅销，出一个卖一个
     *
     * @return
     */
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());

        int saleStatus = rand.nextInt(100);
        System.out.println("IBM 电脑的销售情况为： " + saleStatus);
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale() {
        //库存有多少卖多少
        super.mediator.execute("sale.offsell");
    }
}
