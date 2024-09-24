package behavioral.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public int doPayment(int amount) {
        paymentStrategy.pay(amount);
        return amount;
    }

}
