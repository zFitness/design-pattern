package 装饰模式.成绩;

/**
 * @author zheng
 * @description 老爸查看成绩
 * @date 2021/2/5
 */
public class Father {
    public static void main(String[] args) {
        //把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //签名，休想

    }
}
