package 代理模式.aop;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/30
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知");
    }
}
