package strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public ShoppingCart() {

    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        this.paymentStrategy.pay(amount);
    }
}
