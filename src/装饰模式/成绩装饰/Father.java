package 装饰模式.成绩装饰;

import 装饰模式.成绩.FouthGradeSchoolReport;
import 装饰模式.成绩.SchoolReport;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/5
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        //加了最高分情况说明
        sr = new HighScoreDecorator(sr);
        //加了成绩排名
        sr = new SortDecorator(sr);

        sr.report();

        sr.sign("老三");
    }
}
