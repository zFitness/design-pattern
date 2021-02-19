package 中介者模式.原始进销存;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/1
 */
public class Client {
    public static void main(String[] args) {
        // 采购人员采购电脑
        System.out.println("----采购人员采购电脑----");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);
        // 销售人员销售电脑
        System.out.println("----销售人员销售电脑----");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        // 库存人员管理库存
        Stock stock = new Stock();
        stock.clearStock();
    }
}
