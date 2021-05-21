package 责任链模式;

public class Level3Handler extends Handler {
    public Level3Handler(int level) {
        super(level);
    }

    @Override
    public void process(String message) {
        System.out.println(this.getClass().getSimpleName() + "处理了这个请求");
    }
}
