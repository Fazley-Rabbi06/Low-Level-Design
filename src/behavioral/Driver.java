package behavioral;

import behavioral.strategy.CreditCardPayment;
import behavioral.strategy.PaypalPayment;
import behavioral.strategy.ShoppingCart;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart creditCardPayment = new ShoppingCart(new CreditCardPayment());
        creditCardPayment.doPayment(500);

        ShoppingCart paypalPayment = new ShoppingCart(new PaypalPayment());
        paypalPayment.doPayment(1000);
    }
}
