public class StrategyTest {
    public static void main(String [] args){
        OdemeKonteksti kredi=new OdemeKonteksti(new KrediKartiStrateisi());
        OdemeKonteksti transfer = new OdemeKonteksti(new BankaTransferiStratejisi());
        kredi.odemeYap(100);
        transfer.odemeYap(200);
    }
}
