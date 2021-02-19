package 设计原则.迪米特法则;

import java.util.List;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/25
 */
public class GroupLeader {
    private List<Girl> girls;

    public GroupLeader(List<Girl> girls) {
        this.girls = girls;
    }

    void countGirls() {
        System.out.println("女生的数量是：" + this.girls.size());
    }
}
