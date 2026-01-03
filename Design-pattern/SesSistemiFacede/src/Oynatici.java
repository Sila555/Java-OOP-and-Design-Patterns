public class Oynatici {
    private  boolean caliyorMu=false;
    private boolean duraklatildiMi=false;
    private String sarki;
    public void play(String dosyaAdi){
        sarki=dosyaAdi;
        caliyorMu=true;
        duraklatildiMi=false;
        System.out.println(dosyaAdi+ "oynatılıyor.");
    }
    public void pause(){
        if(caliyorMu){
            duraklatildiMi=true;
            System.out.println("dosya duraklatılıyor");
        }
    }
    public void stop(){
        caliyorMu=false;
        duraklatildiMi=false;
        System.out.println("dosya durduruluyor");
    }
}
