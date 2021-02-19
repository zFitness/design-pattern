package 中介者模式.原始进销存;

import java.util.Random;

/**
 * @author zheng
 * @description 销售管理
 * @date 2021/2/1
 */
public class Sale {
    /**
     * 出售IBM电脑
     *
     * @param number
     */
    public void sellIBMComputer(int number) {
        //访问库存
        Stock stock = new Stock();
        //访问采购
        Purchase purchase = new Purchase();

        //库存不够
        if (stock.getStockNumber() < number) {
            //先买几台
            purchase.buyIBMcomputer(number);
        }

        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);

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
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }
}
