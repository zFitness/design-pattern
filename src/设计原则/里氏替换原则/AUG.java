package 设计原则.里氏替换原则;

/**
 * @author zheng
 * @description 狙击枪
 * @date 2021/1/25
 */
public class AUG extends Rifle{
    public void zoomOut() {
        System.out.println("开始狙击..");
    }

    @Override
    public void shoot() {
        System.out.println("AUG 射击...");
    }
}
