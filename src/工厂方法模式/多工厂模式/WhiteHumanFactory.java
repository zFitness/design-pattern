package 工厂方法模式.多工厂模式;

import 工厂方法模式.BlackHuman;
import 工厂方法模式.Human;
import 工厂方法模式.WhiteHuman;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
