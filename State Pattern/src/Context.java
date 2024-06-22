public class Context {
    private IState state;

    public Context() {
        this.state = null;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
