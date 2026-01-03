public interface PaymentObserver {
    void update(String message);
}
   class EmailLogger implements PaymentObserver {

    @Override
    public void update(String message) {
        System.out.println(
                "E-posta gönderiliyor: [Sistem mesajı: " + message + "]"
        );
    }
}
   class SmsLogger implements PaymentObserver {

    @Override
    public void update(String message) {
        System.out.println(
                "SMS gönderiliyor: [Sistem mesajı: " + message + "]"
        );
    }
}



