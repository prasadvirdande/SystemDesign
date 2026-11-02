package StrategyDesign.RideFareCalculation;

public class Bike implements RatePerKm{
    @Override
    public int calculateRatePerKm() {
        return 8;
    }
}
