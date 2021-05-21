package 工厂模式;

public class XiaoMiPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }
}
