package 策略模式.通用代码;

/**
 * @author zheng
 * @description 高层模块
 * @date 2021/2/6
 */
public class Client {
    public static void main(String[] args) {
        //具体策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
