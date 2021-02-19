package 适配器模式.员工管理;

import java.util.Map;

/**
 * @author zheng
 * @description 劳动服务公司的人员信息类图
 * @date 2021/2/7
 */
public interface IOuterUser {
    /**
     * 基本信息，比如名称，性别，手机号码
     *
     * @return
     */
    Map getUserBaseInfo();

    /**
     * 工作区域信息
     *
     * @return
     */
    Map getUserOfficeInfo();

    /**
     * 用户的家庭信息
     *
     * @return
     */
    Map getUserHomeInfo();
}
