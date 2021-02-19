package 设计原则.接口隔离原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Searcher extends AbstractSearcher {

    public Searcher(IPettyGirl iPettyGirl) {
        super(iPettyGirl);
    }

    @Override
    public void show() {
        System.out.println("---美女的信息如下----");
        getPettyGirl().goodLooking();
        getPettyGirl().niceFigure();
        getPettyGirl().greatTemperament();
    }
}
