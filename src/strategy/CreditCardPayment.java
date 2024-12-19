package strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment credit card amount is " + amount);
    }
}
