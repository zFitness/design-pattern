package 策略模式.加减法运算.传统方法;


/**
 * @author zheng
 * @description 加减法
 * @date 2021/2/6
 */
public class Calculator {
    private final static String ADD_SYMBOL = "+";
    private final static String SUB_SYMBOL = "-";

    public static int exec(int a, int b, String symbol) {
        return ADD_SYMBOL.equals(symbol) ? a + b : a - b;
    }
}
