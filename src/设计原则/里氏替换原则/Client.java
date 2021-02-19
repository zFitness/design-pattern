package 设计原则.里氏替换原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Client {
    public static void main(String[] args) {
        Soldier sanMao = new Soldier();

        sanMao.setGun(new Rifle());
        sanMao.killEnemy();

        //

        Snipper snipper = new Snipper();
        //向下转型
        snipper.killEnemy((AUG) new Rifle());
    }
}
