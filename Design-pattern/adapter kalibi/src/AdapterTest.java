public class AdapterTest {
    public static void main(String [] args){
        EskiOdemeSistemi eski =new EskiOdemeSistemi();
        YeniOdemeSistemi yeni =new OdemeAdapter(eski);
        yeni.odemeYap(500);

    }
}
