package 设计原则.接口隔离原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;


    public PettyGirl(String name) {
        this.name = name;
    }

    /**
     *
     */
    @Override
    public void goodLooking() {
        System.out.println(this.name + "的脸蛋很漂亮...");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "的身材非常棒...");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "气质非常好...");
    }
}
