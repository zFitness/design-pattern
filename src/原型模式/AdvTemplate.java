package 原型模式;

/**
 * @author zheng
 * @description 广告信模板代码
 * @date 2021/1/31
 */
public class AdvTemplate {
    /**
     * 广告信名称
     */
    private String advSubject = "xx银行抽奖活动";

    /**
     * 广告信内容
     */
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万!...";

    public String getAdvSubject() {
        return this.advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}
