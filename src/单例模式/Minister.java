package 单例模式;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstance();

            emperor.say();
        }
    }
}
