package StrategyDesign.RideFareCalculation;

public class Auto implements RatePerKm{
    @Override
    public int calculateRatePerKm() {
       return 10;
    }
}
