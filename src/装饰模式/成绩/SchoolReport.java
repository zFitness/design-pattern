package 装饰模式.成绩;

/**
 * @author zheng
 * @description 抽象成绩单
 * @date 2021/2/5
 */
public abstract class SchoolReport {
    /**
     * 报告成绩
     */
    public abstract void report();

    /**
     * 家长签字
     */
    public abstract void sign(String name);
}
