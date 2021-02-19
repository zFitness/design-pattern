package 装饰模式.通用代码;

/**
 * @author zheng
 * @description 具体装饰类2
 * @date 2021/2/6
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("method2修饰");

    }

    @Override
    public void operate() {
        super.operate();
        method1();
    }
}
