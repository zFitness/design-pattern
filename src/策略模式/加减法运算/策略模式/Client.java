package 策略模式.加减法运算.策略模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        int a = 7, b = 3;
        Context context = new Context(new Add());
        int r = context.exec(a, b);
        System.out.println(r);

        context = new Context(new Sub());
        r = context.exec(a, b);
        System.out.println(r);
    }
}
