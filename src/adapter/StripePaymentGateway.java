package adapter;

public class StripePaymentGateway {
    public void stripeCharge(Double amount) {
        System.out.println("Stripe charge is " + amount + " euro");
    }

    public void StripeRefund(Double amount) {
        System.out.println("Stripe refund is " + amount + " euro");
    }
}
