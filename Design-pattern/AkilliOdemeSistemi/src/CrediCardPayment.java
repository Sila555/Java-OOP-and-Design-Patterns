

public class CrediCardPayment implements PaymentStrategy {
    private String cardNumber;
    public CrediCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment(double amount){
        System.out.println(amount+"TL Kredi Kartı ("+cardNumber +")ile ödendi");
    }

}
