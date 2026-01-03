public class Kitap implements Okunabilir {
    private String baslik;
    private String yazar;
    private int sayfaSayisi;

    // Yapıcı metot
    public Kitap(String baslik, String yazar, int sayfaSayisi) {
        this.baslik = baslik;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public void oku() {
        System.out.println(baslik + " kitabi okunuyor.");
    }

    public void bilgileriYazdir() {

        System.out.println("Başlık: " + baslik + ", Yazar: " + yazar + ", Sayfa: " + sayfaSayisi);
    }


    public String getBaslik() {
        return baslik;
    }


    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
}
