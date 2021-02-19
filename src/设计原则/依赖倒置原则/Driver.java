package 设计原则.依赖倒置原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Driver implements IDriver {
//    public void driver(Benz benz) {
//        System.out.println("司机开始开车");
//        benz.run();
//    }
//
//    public void driver(BMW bmw) {
//        System.out.println("司机开始开车");
//        bmw.run();
//    }

    @Override
    public void driver(ICar car) {
        System.out.println("司机开始开车");
        car.run();
    }
}
