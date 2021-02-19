package 工厂方法模式.多工厂模式;

import 工厂方法模式.Human;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public abstract class AbstractHumanFactory {
    /**
     * 多工厂模式不需要参数
     * @return
     */
    public abstract Human createHuman();
}
