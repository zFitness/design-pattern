package 设计原则.calc;

/**
 * @author zheng
 * @description 除运算器类
 * @date 2021/1/23
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        if (getNumberB() == 0) {
            throw new Exception("除数不能为0");
        } else {
            return getNumberA() / getNumberB();
        }
    }
}
