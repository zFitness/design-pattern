package 装饰模式.通用代码;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);

        component.operate();
    }
}
