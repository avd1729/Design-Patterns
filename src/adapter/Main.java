package adapter;

public class Main {
    public static void main(String[] args) {
        StripePaymentGateway paymentGateway = new StripePaymentGateway();
        StripeAdapter stripeAdapter = new StripeAdapter(paymentGateway);
        PaymentClient paymentClient = new PaymentClient(stripeAdapter);

        paymentClient.makePayment(2000D);
        paymentClient.refundPayment(500D);
    }
}
