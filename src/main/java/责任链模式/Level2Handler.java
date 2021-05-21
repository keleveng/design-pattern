package 责任链模式;

public class Level2Handler extends Handler {
    public Level2Handler(int level) {
        super(level);
    }

    @Override
    public void process(String message) {
        System.out.println(this.getClass().getSimpleName() + "处理了这个请求");
    }
}
