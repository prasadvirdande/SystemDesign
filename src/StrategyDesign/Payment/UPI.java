package StrategyDesign.Payment;

public class UPI implements PaymwntService {
    @Override
    public void pay(double amount) {
        System.out.println("Paid amount " + amount + " using UPI");
    }
}
