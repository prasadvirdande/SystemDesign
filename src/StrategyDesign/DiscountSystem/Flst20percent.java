package StrategyDesign.DiscountSystem;

public class Flst20percent implements  Discount {
    @Override
    public void applyDiscount(int value) {
        System.out.println("Applying flat 20% discount of : "+ ( value-value*0.2 ));
    }
}
