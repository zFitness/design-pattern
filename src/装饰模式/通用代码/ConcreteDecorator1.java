package 装饰模式.通用代码;

/**
 * @author zheng
 * @description 具体装饰类1
 * @date 2021/2/6
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("method1修饰");

    }

    @Override
    public void operate() {
        method1();
        super.operate();
    }
}
