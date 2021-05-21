package 装饰者模式;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doMore() {
        System.out.println("做了更多的事情");
    }
}
