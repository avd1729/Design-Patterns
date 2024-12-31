package adapter;

public class PaymentClient{

    private PaymentProcessor paymentProcessor;
    public PaymentClient(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(Double amount){
        paymentProcessor.processPayment(amount);
    }

    public void refundPayment(Double amount){
        paymentProcessor.refundPayment(amount);
    }


}
