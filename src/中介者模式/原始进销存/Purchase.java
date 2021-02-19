package 中介者模式.原始进销存;

/**
 * @author zheng
 * @description 采购管理
 * @date 2021/2/1
 */
public class Purchase {
    /**
     * 购买 IBM 的电脑
     *
     * @param number
     */
    public void buyIBMcomputer(int number) {
        //访问库存
        Stock stock = new Stock();
        //访问销售
        Sale sale = new Sale();

        //电脑的销售情况
        int saleStatus = sale.getSaleStatus();

        if (saleStatus > 80) {
            System.out.println("采购IBM电脑: " + number + "台");
            stock.increase(number);
        } else {
            //销售情况不好, 折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑： " + buyNumber + "台");
            stock.increase(buyNumber);
        }
    }

    /**
     * 不要采购
     */
    public void refuseBuyIBM() {
        System.out.println("不要采购 IBM 的电脑");
    }
}
