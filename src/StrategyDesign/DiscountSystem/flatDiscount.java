package StrategyDesign.DiscountSystem;

public class flatDiscount implements Discount {
    @Override
    public void applyDiscount(int value) {
        System.out.println("Applying flat discount of  : "+ ( value-100 ));
    }
}
