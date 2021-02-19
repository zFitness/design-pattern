package 中介者模式.通用代码;

/**
 * @author zheng
 * @description 具体同事类
 * @date 2021/2/3
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法 self-method
     */
    public void selfMethod2() {
        //处理自己的业务逻辑
    }

    /**
     * 依赖方法 dep-method
     */
    public void depMethod() {
        // 自己不能处理的业务逻辑，交给中介者处理
        super.mediator.doSomething2();
    }
}
