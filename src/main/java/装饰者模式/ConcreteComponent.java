package 装饰者模式;

public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("做了一些事情");
    }
}
