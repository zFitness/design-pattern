package 装饰模式.通用代码;

/**
 * @author zheng
 * @description 具体构件
 * @date 2021/2/6
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do sth");
    }
}
