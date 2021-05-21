package 抽象工厂模式;

public class SuperFactory2 implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Mask createMask() {
        return new N95Mask();
    }
}
