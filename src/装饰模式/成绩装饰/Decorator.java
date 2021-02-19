package 装饰模式.成绩装饰;

import 装饰模式.成绩.SchoolReport;

/**
 * @author zheng
 * @description 修饰的装饰类
 * @date 2021/2/5
 */
public abstract class Decorator extends SchoolReport {
    /**
     * 首先我要知道是哪个成绩单
     */
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
