package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zheng
 * @description 动态代理类
 * InvocationHandler:  JDK 提供的动态代理类
 * @date 2021/1/29
 */
public class GamePlayIH implements InvocationHandler {
    /**
     * 被代理者
     */
    Class cls = null;

    /**
     * 被代理的实例
     */
    Object obj = null;

    /**
     * 指定代理的对象
     *
     * @param obj
     */
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //如果是登录方法，则发送信息
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.println("有人在用我的账号登录!");
        }
        return result;
    }
}
