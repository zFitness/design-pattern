package 策略模式.三国案例;

/**
 * @author zheng
 * @description 使用计谋
 * @date 2021/2/6
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        //刚刚到吴国的时候拆一个
        System.out.println("----刚刚到吴国的时候拆一个----");
        //拿到妙计
        context= new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n");

        //刘备乐不思蜀，拆第二个
        System.out.println("----刘备乐不思蜀，拆第二个----");
        context = new Context(new GiveGreenLight());
        context.operate();
        System.out.println("\n\n");

        //孙权小兵追来，拆第三个
        System.out.println("----孙权小兵追来，拆第三个----");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n");
    }
}
