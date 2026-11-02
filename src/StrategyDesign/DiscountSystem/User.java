package StrategyDesign.DiscountSystem;

public class User {

    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new DiscountStrategy(new flatDiscount());
        discountStrategy.applyDiscount(500);

        discountStrategy = new DiscountStrategy(new flat10percent());
        discountStrategy.applyDiscount(500);

        discountStrategy = new DiscountStrategy(new Flst20percent());
        discountStrategy.applyDiscount(500);
    }
}
