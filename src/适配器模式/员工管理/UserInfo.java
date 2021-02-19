package 适配器模式.员工管理;

/**
 * @author zheng
 * @description 实现类
 * @date 2021/2/7
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这是员工的家庭地址...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这个人办公室的电话号码是...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这个人的家庭电话号码...");
        return null;
    }
}
