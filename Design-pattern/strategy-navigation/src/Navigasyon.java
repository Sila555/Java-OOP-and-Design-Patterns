public class Navigasyon {
    private RotaHesaplama hesaplama;
    public Navigasyon(RotaHesaplama hesaplama){
        this.hesaplama=hesaplama;
    }
    public void setRotaHesaplama(RotaHesaplama yeniStrateji){
        this.hesaplama=yeniStrateji;

    }
    public void rotaOlustur(String baslangic,String bitis){
        hesaplama.rotaOlustur( baslangic,bitis);// burda string falan yazma bir dahas canim
    }
}
