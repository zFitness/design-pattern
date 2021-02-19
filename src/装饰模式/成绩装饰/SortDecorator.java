package 装饰模式.成绩装饰;

import 装饰模式.成绩.SchoolReport;

/**
 * @author zheng
 * @description 排名装饰类
 * @date 2021/2/5
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
