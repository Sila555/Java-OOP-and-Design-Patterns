public class FacedeTest {
    public static void main(String[] args){
        VeritabaniBaglantisi verBag=new VeritabaniBaglantisi();
        VeriCekmeIslemi verCek=new VeriCekmeIslemi();
        PdfOlusturucu pdfOl=new PdfOlusturucu();

        RaporOlusturmaFacede rapor=new RaporOlusturmaFacede(verBag,verCek,pdfOl);
        rapor.raporOlustur();
        System.out.println("pdf oluşturuluyor");

    }
}
