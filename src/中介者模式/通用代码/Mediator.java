package 中介者模式.通用代码;

/**
 * @author zheng
 * @description 通用抽象中介者
 * @date 2021/2/1
 */
public abstract class Mediator {
    /**
     * 定义同事类
     */
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;


    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }

    //中介者模式的业务逻辑
    public abstract void doSomething1();

    public abstract void doSomething2();
}
