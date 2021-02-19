package 单例模式.拓展单例模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zheng
 * @description 多个皇帝
 * @date 2021/1/26
 */
public class Emperor {
    /**
     * 定义最多能产生的实例数量
     */
    private static int maxNumOfEmperor = 2;

    /**
     * 每个皇帝的名字， 使用 ArrayList 来容纳
     */
    private static ArrayList<String> nameList = new ArrayList<>();

    /**
     * 容纳皇帝的实例
     */
    private static ArrayList<Emperor> emperors = new ArrayList<>();

    /**
     * 当前皇帝序列号
     */
    private static int countNumOfEmperor = 0;

    /**
     * 产生所有对象
     */
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperors.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor() {
        // 不能被 new 进行实例化
    }

    /**
     * 传入皇帝名称，建立皇帝对象
     */
    private Emperor(String name) {
        nameList.add(name);
    }

    /**
     * 随机获得一个皇帝
     */
    public static Emperor getInstance() {
        Random random = new Random();
        // 随机拉出一个皇帝，只要是精神领袖就行
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);

        return emperors.get(countNumOfEmperor);
    }

    /**
     * 皇帝发话了
     */
    public void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
