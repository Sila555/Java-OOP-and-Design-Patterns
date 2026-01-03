public class FacedeTest {
    public static void main(String[] args){
        SesSistemi ses=new SesSistemi();
        MuzikDosyasiYoneticisi mizy=new MuzikDosyasiYoneticisi();
        Oynatici oyn=new Oynatici();
        MuzikSistemi muzik=new MuzikSistemi(ses,mizy,oyn);
            muzik.MuzikDinlemeyeBasla("sarki1.mp3 ");
            System.out.println("müzik dinleniyor");
            muzik.sarkiDegistir("sarki2.mp3 ");
            System.out.println("sarki değiştirildi.");
            muzik.dinlemeyiBitir();
            System.out.println("şarkı kapatıldı");

    }
}
