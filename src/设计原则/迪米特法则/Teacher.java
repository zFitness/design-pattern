package 设计原则.迪米特法则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Teacher {
    public void commond(GroupLeader groupLeader) {
//        List<Girl> girls = new ArrayList<>();
//
//        for (int i = 0; i < 20; i++) {
//            girls.add(new Girl());
//        }

        groupLeader.countGirls();
    }
}
