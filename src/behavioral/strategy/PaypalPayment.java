package behavioral.strategy;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+"tk using Paypal");
    }
}
