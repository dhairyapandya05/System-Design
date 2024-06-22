public class StartState implements IState{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in the start State 🔥🔥🔥");
    }
    public String toString(){
        return "Start State";
    }
}
