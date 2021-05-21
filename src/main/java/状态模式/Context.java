package 状态模式;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void ChangeState(State state){
        this.state = state;
    }
    public void doSomething(){
        state.doWork();
    }
}
