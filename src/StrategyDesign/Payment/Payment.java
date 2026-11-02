package StrategyDesign.Payment;

public class Payment {

    private PaymwntService paymentService;

    public Payment(PaymwntService paymentStrategy) {
        this.paymentService = paymentStrategy;
    }
    public void pay(double amount) {
        paymentService.pay(amount);
    }


}
