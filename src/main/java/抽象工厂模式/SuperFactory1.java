package 抽象工厂模式;

public class SuperFactory1 implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Mask createMask() {
        return new N90Mask();
    }
}
