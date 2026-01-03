public class PaymentFactory {
    public static  PaymentStrategy createPaymentMethod(String type){
        if(type==null) {
            return null;
        }
        if(type.equalsIgnoreCase("CREDIT_CARD")) {
            // gerçek senaryoda bu veriler kullanıcıdan veya veritabanından gelir
            return new CrediCardPayment("4444-5555-6666-7777");
        }else if(type.equalsIgnoreCase("PAYPAL")){
        return new PayPalPayment("user@example.com");
    }
    throw new IllegalArgumentException("Bilinmeyen ödeme yöntemi:" + type);
    }
}
