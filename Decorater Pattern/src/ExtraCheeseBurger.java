public class ExtraCheeseBurger extends BurgerDecorater{
    private Burger burger;
    public ExtraCheeseBurger(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDesctiption() {
        return burger.getDesctiption()+" with Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+ 10.0;
    }
}
