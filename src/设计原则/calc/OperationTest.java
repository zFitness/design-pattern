package 设计原则.calc;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/23
 */
public class OperationTest {


    public static void main(String[] args) throws Exception {
        Operation o1 = new OperationAdd(1, 2);
        System.out.println(o1.getResult());

        System.out.println(OperationFactory.createOperate("+", 1, 2).getResult());
    }
}
