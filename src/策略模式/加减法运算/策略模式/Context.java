package 策略模式.加减法运算.策略模式;

/**
 * @author zheng
 * @description 上下文
 * @date 2021/2/6
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
