public class ExtraMayoBurger extends BurgerDecorater{
    private Burger burger;
    public ExtraMayoBurger(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDesctiption() {
        return burger.getDesctiption()+" with Extra Mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost()+ 30.0;
    }
}
