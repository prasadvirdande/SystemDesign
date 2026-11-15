package DecoratorDesignPattern;

public class BasicCoffee implements  Coffee {
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}
