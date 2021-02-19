package 代理模式.aop;

/**
 * @author zheng
 * @description 真实主题类
 * @date 2021/1/30
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
