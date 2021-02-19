package 责任链模式.三从四德;

/**
 * @author zheng
 * @description 有处理权的人员接口
 * @date 2021/2/4
 */
public interface IHandler {
    void handleMessage(IWomen women);
}
