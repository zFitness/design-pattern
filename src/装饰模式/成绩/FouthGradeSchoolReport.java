package 装饰模式.成绩;

/**
 * @author zheng
 * @description 四年级成绩单
 * @date 2021/2/5
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的家长:");
        System.out.println("----");
        System.out.println("语文 66, 数学 22");
        System.out.println("----");
        System.out.println("家长签名");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
