package 代理模式.通用代码;

/**
 * @author zheng
 * @description 代理类
 * @date 2021/1/29
 */
public class Proxy implements Subject {
    /**
     * 要代理的实现类
     */
    private Subject subject = null;

    /**
     * 空参默认被代理者
     */
    public Proxy() {
        subject = new Proxy();
    }


    /**
     * 构造函数传递代理者
     * @param objects
     */
    public Proxy(Object ...objects) {

    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        this.subject.request();
        after();
    }

    /**
     * 预处理方法
     */
    private void before() {
        System.out.println("预处理");
    }

    /**
     * 善后处理
     */
    private void after() {
        System.out.println("善后处理");
    }
}
