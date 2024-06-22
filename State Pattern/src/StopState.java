public class StopState implements IState{
    @Override
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("Player is in the Stop State 🛑🛑🛑");
    }
    public String toString(){
        return "Stop State";
    }
}
