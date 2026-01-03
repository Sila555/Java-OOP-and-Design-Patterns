import java.util.List;
import java.util.ArrayList;

public class Menu implements MenuBileseni {
    private String ad;
    private List <MenuBileseni> altMenuler=new ArrayList<>();

    public Menu(String ad){
        this.ad=ad;
    }


    public  void bilesenEkle(MenuBileseni bilesen) {
        altMenuler.add(bilesen);
    }
        public void bilesenCıkar(MenuBileseni bilesen){
            altMenuler.remove(bilesen);
        }
        @Override
         public void goster(){
            System.out.println("=== " +ad+"===");
            for(MenuBileseni bilesen : altMenuler) {
                bilesen.goster();
            }
    }
    @Override
    public double fiyatHesapla(){
     double toplam=0;
     for (MenuBileseni bilesen : altMenuler){
         toplam += bilesen.fiyatHesapla();
     }
     return toplam;
    }

}
