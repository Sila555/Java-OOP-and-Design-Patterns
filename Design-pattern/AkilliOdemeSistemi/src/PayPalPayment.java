public class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email){
        this.email=email;
    }
    @Override
    public void processPayment(double amount){
        System.out.println(amount + "TL PayPal ("+email +") ile ödendi.");
    }
}
