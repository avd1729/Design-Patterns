package strategy;

public class Driver {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new GooglePayPayment();
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(paymentStrategy);
        cart.checkout(500);
    }
}
