package 工厂模式;

public class Test {
    public static void main(String[] args) {
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        huaweiPhoneFactory.createPhone();
        XiaoMiPhoneFactory xiaoMiPhoneFactory = new XiaoMiPhoneFactory();
        xiaoMiPhoneFactory.createPhone();
    }
}
