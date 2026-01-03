
public class Araba extends Arac {
    private int kapiSayisi;

    public Araba(String marka, int hiz, int kapiSayisi) {
        super(marka, hiz);
        this.kapiSayisi = kapiSayisi;
    }
    @Override
    public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Kapi Sayisi: " + kapiSayisi);
    }
}
