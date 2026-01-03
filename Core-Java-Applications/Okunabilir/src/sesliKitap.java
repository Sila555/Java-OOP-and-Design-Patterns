public class  sesliKitap extends Kitap implements Okunabilir  {
   private double sure;
   public sesliKitap(String baslik, String yazar, int sayfaSayisi,double sure){
       super(baslik,yazar,sayfaSayisi);
       this.sure=sure;
   }
    @Override
    public void oku() {
        System.out.println(getBaslik() + " Sesli kitabi sesli olarak oynatiliyor.");
    }
   puclic double getSure(){
       return sure;
    }
    public void setsure(double sure) {
        this sure = sure;
    }
        @Override
        public void bilgileriYazdir() {
            super.bilgileriYazdir();
            System.out.println("Sesli Kitap Süresi: " + sure + " saat");
        }

    public boolean sureyiKontrolEt(){
       if(sure<10) {
           return this.sure < 10.0;
       }

    }


}

