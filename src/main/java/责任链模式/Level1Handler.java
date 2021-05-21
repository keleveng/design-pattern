package 责任链模式;

public class Level1Handler extends Handler {

    public Level1Handler(int level) {
        super(level);
        this.level = level;
    }

    @Override
    public void process(String message) {
        System.out.println(this.getClass().getSimpleName() + "处理了这个请求");
    }
}
