package StrategyDesign.RideFareCalculation;

public class Ride {
    private double distance;

    private RatePerKm ratePerKm;

    public Ride(double distance, RatePerKm ratePerKm) {
        this.distance = distance;
        this.ratePerKm = ratePerKm;
    }



    public double calculateFare() {
        return distance * ratePerKm.calculateRatePerKm();
    }
}
