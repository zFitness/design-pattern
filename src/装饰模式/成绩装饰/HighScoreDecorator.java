package 装饰模式.成绩装饰;

import 装饰模式.成绩.SchoolReport;

/**
 * @author zheng
 * @description 最高成绩修饰
 * @date 2021/2/5
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75, 数学是78, 自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
