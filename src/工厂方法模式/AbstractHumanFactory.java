package 工厂方法模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public abstract class AbstractHumanFactory {
    /**
     * 使用泛型对 createHuman 的输入参数产生两层限制
     * 1. 必须是 Class 类型
     * 2. 必须是 Human 的实现类
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
