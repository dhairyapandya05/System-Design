//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDesctiption()+" "+burger.getCost());
        burger = new ExtraCheeseBurger(burger);
        System.out.println(burger.getDesctiption()+" "+burger.getCost());
        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getDesctiption()+" "+burger.getCost());

    }
}