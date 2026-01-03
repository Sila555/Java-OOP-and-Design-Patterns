public class RaporOlusturmaFacede {
    VeritabaniBaglantisi veritabaniBaglantisi;
    VeriCekmeIslemi veriCekmeIslemi;
    PdfOlusturucu pdfOlusturucu;
    public RaporOlusturmaFacede(VeritabaniBaglantisi veritabaniBaglantisi,VeriCekmeIslemi veriCekmeIslemi,PdfOlusturucu pdfOlusturucu){
        this.veritabaniBaglantisi=veritabaniBaglantisi;
        this.veriCekmeIslemi=veriCekmeIslemi;
        this.pdfOlusturucu=pdfOlusturucu;
    }
    public void raporOlustur(){
        veritabaniBaglantisi.baglan();
        veriCekmeIslemi.cekme();
        pdfOlusturucu.pdfOlustur();
    }
}
