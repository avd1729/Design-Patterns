package strategy;

public class GooglePayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment google pay amount: " + amount);
    }
}
