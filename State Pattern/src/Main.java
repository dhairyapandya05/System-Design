//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context c1 = new Context();
        IState s1 = new StartState();
        s1.doAction(c1);
        System.out.println(c1.getState().toString());

        Context c2 = new Context();
        IState s2 = new StopState();
        s2.doAction(c2);
        System.out.println(c2.getState().toString());


    }
}