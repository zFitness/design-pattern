package 适配器模式.员工管理;

/**
 * @author zheng
 * @description 员工信息接口
 * @date 2021/2/7
 */
public interface IUserInfo {
    /**
     * 获取员工姓名
     * @return
     */
    String getUserName();

    /**
     * 获取家庭地址
     * @return
     */
    String getHomeAddress();

    /**
     * 手机号码
     * @return
     */
    String getMobileNumber();

    /**
     * 办公电话
     * @return
     */
    String getOfficeTelNumber();

    /**
     * 职位
     * @return
     */
    String getJobPosition();

    /**
     * 获得家庭电话
     * @return
     */
    String getHomeTelNumber();
}
