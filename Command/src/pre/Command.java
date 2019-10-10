package pre;

/**
 *  将"请求" 封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也可以支持撤销的操作.
 */
public interface Command {
    public void execute();
}
