package 策略模式.加减法运算.传统方法;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        int a = 9, b= 3;
        int result = Calculator.exec(a, b, "-");
        System.out.println(result);
    }
}
