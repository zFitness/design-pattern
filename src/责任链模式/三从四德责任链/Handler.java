package 责任链模式.三从四德责任链;

import 责任链模式.三从四德.IWomen;

/**
 * @author zheng
 * @description 修改后的 Handler 类
 * @date 2021/2/4
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    /**
     * 能处理的级别
     */
    private int level = 0;
    /**
     * 责任传递，下一个责任人是谁
     */
    private Handler nextHandler;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     * @param level
     */
    public Handler(int level) {
        this.level = level;
    }

    /**
     * 处理 women 的请求
     *
     * @param women
     */
    public final void handleMessage(IWomen women) {
        System.out.println(women.getRequest());
//        System.out.println(this.level);
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                //有后续环节，才把请求往后传递
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("----没有地方请示了，按不同意处理----\n");
            }
        }
    }

    /**
     * 如果不属于你处理的请求， 你应该让他找下一个环节的人，入女儿出嫁了
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫
     *
     * @param handler
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 有请求当然有回应
     *
     * @param women
     */
    protected abstract void response(IWomen women);
}
