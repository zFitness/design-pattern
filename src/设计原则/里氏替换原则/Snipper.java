package 设计原则.里氏替换原则;

/**
 * @author zheng
 * @description 狙击手类
 * @date 2021/1/25
 */
public class Snipper {
    public void killEnemy(AUG aug) {
        aug.zoomOut();
        aug.shoot();
    }
}
