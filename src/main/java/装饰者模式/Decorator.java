package 装饰者模式;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    //原有功能
    @Override
    public void doSomething() {
        component.doSomething();
    }

    //添加功能
    public abstract void doMore();

}
