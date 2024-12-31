package adapter;

public interface PaymentProcessor {
    void processPayment(Double amount);
    void refundPayment(Double amount);
}
