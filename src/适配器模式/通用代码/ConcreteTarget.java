package 适配器模式.通用代码;

/**
 * @author zheng
 * @description 目标角色的实现类
 * @date 2021/2/7
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("你需要帮助吗?");
    }
}
