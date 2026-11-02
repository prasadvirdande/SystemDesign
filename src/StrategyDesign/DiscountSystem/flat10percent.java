package StrategyDesign.DiscountSystem;

public class flat10percent implements  Discount {
    @Override
    public void applyDiscount(int value) {
        System.out.println("Applying flat 10% discount of : "+ (value - value*0.1 ));
    }
}
