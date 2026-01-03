public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    //Stateji dışarıdan enjekte edilir
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy=strategy;
    }
    public void checkout(double amount){
        if(paymentStrategy== null){
            throw new IllegalStateException("Ödeme yöntemi seçilmedi.");
        }
        paymentStrategy.processPayment(amount);
    }
}
