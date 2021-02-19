package 设计原则.calc;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/23
 */
public class OperationFactory {
    /**
     * 无参数
     *
     * @param operate
     * @return
     */
    public static Operation createOperate(String operate) throws Exception {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new Exception("非法的操作符");
        }
        return operation;
    }

    public static Operation createOperate(String operate, double a, double b) throws Exception {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd(a, b);
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new Exception("非法的操作符");
        }
        return operation;
    }
}
