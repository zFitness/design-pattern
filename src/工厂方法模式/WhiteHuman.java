package 工厂方法模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种肤色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白色人种嘿嘿嘿");
    }
}
