package 策略模式.加减法运算.策略枚举;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        int a = 100, b = 44;
        System.out.println(Calculator.ADD.exec(a, b));
        System.out.println(Calculator.SUB.exec(a, b));
    }
}
