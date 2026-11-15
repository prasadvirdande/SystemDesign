package DecoratorDesignPattern;

public class ChoclateCoffee extends CoffeeDescorator {
    public ChoclateCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost()+25;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"choclate";
    }
}
