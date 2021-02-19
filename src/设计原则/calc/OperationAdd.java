package 设计原则.calc;

/**
 * @author zheng
 * @description 加运算器类
 * @date 2021/1/23
 */
public class OperationAdd extends Operation {
    public OperationAdd() {
        super();
    }

    public OperationAdd(double numberA, double numberB) {
        super(numberA, numberB);
    }

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
