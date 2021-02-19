package 设计原则.里氏替换原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class MachineGun extends AbstractGun{
    @Override
    void shoot() {
        System.out.println("机枪");
    }
}
