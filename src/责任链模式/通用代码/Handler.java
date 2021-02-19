package 责任链模式.通用代码;

/**
 * @author zheng
 * @description 抽象处理者
 * @date 2021/2/4
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者
            }
        }
        return response;
    }

    /**
     * 设置下一个处理者
     *
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 每个处理者都有一个处理级别
     *
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);


}
