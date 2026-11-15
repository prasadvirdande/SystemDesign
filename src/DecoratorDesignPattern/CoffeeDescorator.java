package DecoratorDesignPattern;

public abstract class CoffeeDescorator implements Coffee {
  protected Coffee coffee;
  public CoffeeDescorator(Coffee coffee) {
      this.coffee=coffee;
  }
}
