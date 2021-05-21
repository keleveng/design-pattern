package 工厂模式;

public class HuaweiPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
