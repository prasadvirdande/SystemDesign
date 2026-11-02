package StrategyDesign.DiscountSystem;

public class DiscountStrategy {

    private Discount discount;

    public DiscountStrategy(Discount discount) {
        this.discount = discount;
    }

    public void applyDiscount(int value) {
        discount.applyDiscount(value);
    }
}
