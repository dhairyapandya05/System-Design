//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone phone;
        PhoneBuilder builder= new PhoneBuilder();
        phone= builder.setbattery(1000).setprocessor("Snapderagon").setos("IOS").setcore(8).setyearoflaunch(2020).build();
        phone.displayspecs();
    }
}