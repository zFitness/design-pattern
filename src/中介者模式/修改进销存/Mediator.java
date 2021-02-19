package 中介者模式.修改进销存;

/**
 * @author zheng
 * @description 具体中介者
 * @date 2021/2/1
 */
public class Mediator extends AbstractMediator {
    /**
     * 中介者最重要的方法
     *
     * @param str
     * @param objects
     */
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            //采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            //销售电脑
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            //折价销售
            this.offSell();
        } else if (str.equals("stock.clear")) {
            //清仓处理
            this.clearStock();
        }
    }

    /**
     * 采购电脑
     *
     * @param number
     */
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            //销售情况好
            System.out.println("采购IBM电脑： " + number + " 台");
            super.stock.increase(number);
        } else {
            //销售情况不好, 折半销售
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑： " + buyNumber + " 台");
            super.stock.increase(buyNumber);
        }
    }

    /**
     * 销售电脑
     *
     * @param number
     */
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            //库存不足
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    /**
     * 折价销售电脑
     */
    private void offSell() {
        System.out.println("折价销售电脑： " + stock.getStockNumber() + "台");
    }

    /**
     * 清仓处理
     */
    private void clearStock() {
        //要求清仓处理
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }

}
