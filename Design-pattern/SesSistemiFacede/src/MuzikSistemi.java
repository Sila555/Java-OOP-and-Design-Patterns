public class MuzikSistemi {
    private SesSistemi sesSistemi;
    private MuzikDosyasiYoneticisi muzikDosyasiYoneticisi;
    private Oynatici oynatici;
    public MuzikSistemi(SesSistemi sesSistemi,MuzikDosyasiYoneticisi muzikDosyasiYöneticisi,Oynatici oynatici){
        this.sesSistemi=sesSistemi;
        this.muzikDosyasiYoneticisi=muzikDosyasiYöneticisi;
        this.oynatici=oynatici;
    }
    public void MuzikDinlemeyeBasla(String dosyaAdi){
        sesSistemi.volumeUp();
        muzikDosyasiYoneticisi.openFile(dosyaAdi);
        oynatici.play(dosyaAdi);

    }
    public void sarkiDegistir(String yeniSarki){
        oynatici.stop();
        muzikDosyasiYoneticisi.closeFile();
        muzikDosyasiYoneticisi.openFile(yeniSarki);
        oynatici.play(yeniSarki);
    }
    public void dinlemeyiBitir(){
        sesSistemi.volumeDown();
        muzikDosyasiYoneticisi.closeFile();
        oynatici.stop();
    }
}
