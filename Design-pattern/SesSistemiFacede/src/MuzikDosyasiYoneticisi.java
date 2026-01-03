public class MuzikDosyasiYoneticisi {
    private String aktifDosya;
    private boolean acikMi;
    public void openFile(String dosyaAdi){
        aktifDosya=dosyaAdi;
        acikMi=true;
        System.out.println("dosya açılıyor");
    }
    public void closeFile(){
        System.out.println("dosya kapatılıyor");
        acikMi=false;
        aktifDosya=null;
    }
    public String getAktifDosya(String dosyaAdi) {
        return aktifDosya;
    }
    public boolean isAcikMi() {
        return acikMi;
    }


}
