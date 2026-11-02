package StrategyDesign.RideFareCalculation;

public class Car implements  RatePerKm {
    @Override
    public int calculateRatePerKm() {
        return 12;
    }
}
