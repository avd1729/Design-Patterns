package strategy;

public class Driver {
    public static void main(String[] args) {
        strategy.PaymentStrategy paymentStrategy = new strategy.CreditCardPayment();
        strategy.ShoppingCart cart = new strategy.ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(500);
    }
}
