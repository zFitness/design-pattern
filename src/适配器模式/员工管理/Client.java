package 适配器模式.员工管理;

/**
 * @author zheng
 * @description TODO
 * @date 2021/2/7
 */
public class Client {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();

        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

        //使用适配器对接外部系统
        IUserInfo youngBoy = new OutUserInfo();
        for (int i = 0; i < 101; i++) {
            youngBoy.getMobileNumber();
        }
    }
}
