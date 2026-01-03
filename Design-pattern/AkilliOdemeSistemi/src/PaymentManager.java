import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private List<PaymentObserver> observers = new ArrayList<>();

    // yeni bir gözlemci ekle
    public void attach(PaymentObserver observer) {
        observers.add(observer);
    }

    // tüm gözlemcilere haber ver
    public void notifyObservers(String message) {
        for (PaymentObserver observer : observers) {
            observer.update(message);
        }
    }
    public void completePayment(double amount){
        System.out.println(amount+"TL tutarındaki işlem merkez bankası tarafından onaylandı.");
        // olay gerçekleşti gözlemcilere haber ver
        notifyObservers("Ödeme başarıyla gerçekleşti.Tutar: "+amount);
    }
}
