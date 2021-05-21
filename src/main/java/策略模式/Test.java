package 策略模式;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(3, 4));
        context.changeStrategy(new Mutiply());
        System.out.println(context.executeStrategy(3, 4));
        context.changeStrategy(new Subtract());
        System.out.println(context.executeStrategy(3, 4));
    }
}
