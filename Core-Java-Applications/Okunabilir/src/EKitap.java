
public class EKitap extends Kitap implements Okunabilir {
    private double dosyaBoyutu;


    public EKitap(String baslik, String yazar, int sayfaSayisi, double dosyaBoyutu) {
        super(baslik, yazar, sayfaSayisi);
        this.dosyaBoyutu = dosyaBoyutu;
    }

    @Override
    public void oku() {
        System.out.println(getBaslik() + " e-kitabı dijital olarak okunuyor.");
    }

    public void indir() {
        System.out.println(getBaslik() + " indiriliyor, boyut: " + dosyaBoyutu + " Mb");
    }

    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Dosya Boyutu: " + dosyaBoyutu + " Mb");
    }
}
