//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        operatingsystemfactory osf = new operatingsystemfactory();
        os obj1 = osf.getInstance("Open");
        obj1.spec();

        os obj2 = osf.getInstance("Closed");
        obj2.spec();
    }
}