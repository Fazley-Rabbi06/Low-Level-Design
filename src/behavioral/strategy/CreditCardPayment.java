package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+"tk using Credit Card");
    }
}
