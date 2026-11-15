package DecoratorDesignPattern;

public class MilkCoffee extends CoffeeDescorator{
    MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return coffee.getCost()+10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " Milk Coffee";
    }
}
