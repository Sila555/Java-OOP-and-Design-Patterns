public class OdemeKonteksti {
    private OdemeStratejisi strateji;
    public OdemeKonteksti(OdemeStratejisi strateji){
        this.strateji=strateji;
    }
    public void odemeYap(double miktar){
        strateji.odemeYap(miktar);
    }
}
