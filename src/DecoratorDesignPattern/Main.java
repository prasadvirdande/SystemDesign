package DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {
        Coffee coffee= new BasicCoffee();
        coffee =new MilkCoffee(coffee);
        coffee =new ChoclateCoffee(coffee);
        coffee=new MilkCoffee(coffee);
        coffee =new WhippedCreame(coffee);

        System.out.println("order: "+coffee.getDescription());
        System.out.println("amount: "+ coffee.getCost());
    }
}
