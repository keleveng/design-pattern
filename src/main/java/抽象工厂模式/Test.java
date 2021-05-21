package 抽象工厂模式;

public class Test {
    public static void main(String[] args) {
        SuperFactory1 superFactory1 = new SuperFactory1();
        superFactory1.createMask();
        superFactory1.createPhone();

        SuperFactory2 superFactory2 = new SuperFactory2();
        superFactory2.createMask();
        superFactory2.createPhone();
    }
}
