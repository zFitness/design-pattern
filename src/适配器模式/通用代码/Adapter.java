package 适配器模式.通用代码;

/**
 * @author zheng
 * @description 适配器角色
 * @date 2021/2/7
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
