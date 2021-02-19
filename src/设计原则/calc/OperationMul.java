package 设计原则.calc;

/**
 * @author zheng
 * @description 乘运算器类
 * @date 2021/1/23
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
