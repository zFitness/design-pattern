package 装饰模式.通用代码;

/**
 * @author zheng
 * @description 抽象装饰者
 * @date 2021/2/6
 */
public abstract class Decorator extends Component {
    /**
     * 指向抽象构件
     */
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 委托给被修饰者执行
     */
    @Override
    public void operate() {
        this.component.operate();
    }
}
