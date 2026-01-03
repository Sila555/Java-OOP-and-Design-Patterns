public class Calisan implements IKurumsalBirim {
    private String ad;
    private double maas;

   public Calisan(String ad,double maas) {
       this.ad = ad;
       this.maas = maas;
   }
   @Override
    public double maasHesapla(){
       return this.maas;
   }
   @Override
    public void goster(){
       System.out.println("Calisan: "+ ad +"(Maaş: " + maas + "TL");

   }
}
