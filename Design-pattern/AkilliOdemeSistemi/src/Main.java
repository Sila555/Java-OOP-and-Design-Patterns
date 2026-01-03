public class Main {
    public static void main(String[] args) {

        PaymentManager paymentManager = new PaymentManager();

        // Observer'lar
        paymentManager.attach(new EmailLogger());
        paymentManager.attach(new SmsLogger());

        // Factory
        PaymentStrategy myPayment =
                PaymentFactory.createPaymentMethod("PAYPAL");

        // Strategy
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(myPayment);

        double totalAmount = 750.0;
        cart.checkout(totalAmount);

        // Observer tetiklenir
        paymentManager.completePayment(totalAmount);
    }
}




