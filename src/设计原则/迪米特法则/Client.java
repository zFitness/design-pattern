package 设计原则.迪米特法则;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class Client {
    public static void main(String[] args) {
        List<Girl> girls = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }
        
        GroupLeader groupLeader = new GroupLeader(girls);

        Teacher teacher = new Teacher();

        teacher.commond(groupLeader);
    }
}
