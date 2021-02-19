package 适配器模式.员工管理;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zheng
 * @description 劳动服务公司的人员实现
 * @date 2021/2/7
 */
public class OutUser implements IOuterUser {
    /**
     * 用户的基本信息
     *
     * @return
     */
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;
    }

    /**
     * 员工的家庭信息
     *
     * @return
     */
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("userName", "这个人的职位是BOSS...");
        officeInfo.put("mobileNumber", "这个员工的办公电话是...");
        return officeInfo;
    }

    /**
     * 员工的工作信息，比如，职位
     *
     * @return
     */
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("userName", "这个员工的家庭电话...");
        homeInfo.put("mobileNumber", "这个员工电话是...");
        return homeInfo;
    }
}
