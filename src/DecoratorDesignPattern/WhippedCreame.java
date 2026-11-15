package DecoratorDesignPattern;

public class WhippedCreame extends CoffeeDescorator{
    public WhippedCreame(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost()+25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " whipped Creame";
    }
}
