package StrategyDesign.RideFareCalculation;

public class PremoumCar implements RatePerKm{
    @Override
    public int calculateRatePerKm() {
       return 20;
    }
}
