package 中介者模式.通用代码;

/**
 * @author zheng
 * @description 通用中介者
 * @date 2021/2/3
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        //调用同事类的方法，
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
