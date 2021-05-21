package 状态模式;

public class Test {
    public static void main(String[] args) {
        Context person = new Context(new Happy());
        person.doSomething();
        person.ChangeState(new Sad());
        person.doSomething();
        person.ChangeState(new Angry());
        person.doSomething();
    }
}
