//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Client ct = new Client();
        VehicleFactory sct = new ScooterFactory();
        VehicleFactory carf = new CarFactory();
        ct.initialise(sct);
        ct.initialise(carf);
    }
}