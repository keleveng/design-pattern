package 装饰者模式;

public class Test {
    public static void main(String[] args) {

        Component concreteComponent = new ConcreteComponent();
        concreteComponent.doSomething();
        Decorator decorator = new ConcreteDecorator(concreteComponent);
        decorator.doSomething();
        decorator.doMore();
    }
}
