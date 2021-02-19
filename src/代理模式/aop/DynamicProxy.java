package 代理模式.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zheng
 * @description 动态代理类
 * @date 2021/1/30
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找 JoinPoint 连接点， AOP 框架使用元数据定义
        if (true) {
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        // 执行目标，返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
