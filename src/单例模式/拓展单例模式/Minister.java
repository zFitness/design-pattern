package 单例模式.拓展单例模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class Minister {
    public static void main(String[] args) {
        //定义5个大臣
        int ministerNum = 5;

        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}
