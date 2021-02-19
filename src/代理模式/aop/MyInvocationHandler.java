package 代理模式.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zheng
 * @description 动态代理的 Handler 类
 * @date 2021/1/30
 */
public class MyInvocationHandler implements InvocationHandler {
    /**
     * 被代理的对象
     */
    private Object target = null;

    /**
     * 通过构造函数传递的一个对象
     */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 代理方法
     * 所有动态代理实现的方法全部通过 invoke 进行调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行被代理的方法
        return method.invoke(this.target, args);
    }
}
