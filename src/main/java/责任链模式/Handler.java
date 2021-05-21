package 责任链模式;

public abstract class Handler {
    protected int level;
    protected Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void LoadMessage(int level, String message) {
        if (level <= this.level)
            process(message);
        else if (this.nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + "处理不了级别为" + level + "的请求,交给下一个处理器处理");
            this.nextHandler.LoadMessage(level, message);
        } else {
            System.out.println(this.getClass().getSimpleName() + ":我没有下一个处理器,该请求无法处理");
        }

    }

    public abstract void process(String message);
}
