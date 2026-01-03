public class Dugme implements IGUIBilesen{
    private String etiket;
   public Dugme(String etiket){
       this.etiket=etiket;
   }

    @Override
    public void ciz() {
        System.out.println("Düğme çiziliyor: [ "+etiket + "]");
    }
}
