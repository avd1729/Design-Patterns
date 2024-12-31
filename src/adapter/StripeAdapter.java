package adapter;

public class StripeAdapter implements PaymentProcessor{

    StripePaymentGateway stripePaymentGateway;

    public StripeAdapter(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public void processPayment(Double amount) {
        stripePaymentGateway.stripeCharge(amount);
    }

    @Override
    public void refundPayment(Double amount) {
        stripePaymentGateway.StripeRefund(amount);
    }
}
