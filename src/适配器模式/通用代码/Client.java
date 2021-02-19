package 适配器模式.通用代码;

/**
 * @author zheng
 * @description 场景类
 * @date 2021/2/7
 */
public class Client {
    public static void main(String[] args) {
        //原有的业务逻辑
        Target target =new ConcreteTarget();
        target.request();

        //现在增加适配器角色后的业务逻辑
        Target target1 = new Adapter();
        target1.request();
    }
}
