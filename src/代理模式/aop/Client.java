package 代理模式.aop;

import java.lang.reflect.InvocationHandler;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/1/30
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();

        //定义一个 Handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);

        //代理的行为
        proxy.doSomething("Finish");
    }
}
