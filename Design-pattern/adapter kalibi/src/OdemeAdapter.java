public class OdemeAdapter implements YeniOdemeSistemi {
    private EskiOdemeSistemi eskiSistem;
    public OdemeAdapter(EskiOdemeSistemi eskiSistem){
        this.eskiSistem=eskiSistem;
    }
    @Override
    public void odemeYap(double miktar){
        eskiSistem.islemYap(miktar);
    }

}
