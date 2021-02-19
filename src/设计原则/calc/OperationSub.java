package 设计原则.calc;

/**
 * @author zheng
 * @description 减运算器类
 * @date 2021/1/23
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
