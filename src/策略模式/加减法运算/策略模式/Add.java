package 策略模式.加减法运算.策略模式;

/**
 * @author zheng
 * @description 具体策略，加
 * @date 2021/2/6
 */
public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
