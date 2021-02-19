package 代理模式.通用代码;

/**
 * @author zheng
 * @description 具体主题角色
 *  也叫被委托角色，被代理角色。业务逻辑的具体执行者
 * @date 2021/1/29
 */
public class RealSubject implements Subject{
    /**
     * 实现方法
     */
    @Override
    public void request() {
        // 业务逻辑处理

    }
}
