package facade;

public class PaymentSystem {
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of: $" + amount);
        return true; // Assume payment always succeeds for simplicity
    }
}