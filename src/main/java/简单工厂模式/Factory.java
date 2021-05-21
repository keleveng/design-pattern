package 简单工厂模式;

public class Factory {
    public static Product createProduct(String arg) {
        if ("A".equals(arg))
            return new ProductA();
        else if ("B".equals(arg))
            return new ProductB();
        return null;
    }
}
