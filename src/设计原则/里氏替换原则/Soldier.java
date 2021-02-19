package 设计原则.里氏替换原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人");
        gun.shoot();
    }
}
