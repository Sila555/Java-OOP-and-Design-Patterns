import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuBileseni{
    private String ad;
    private List<MenuBileseni>RestoranMenusu=new ArrayList<>();

    public Menu(String ad){
        this.ad=ad;
    }
    public void bilesenEkle(MenuBileseni bilesen)  {
        RestoranMenusu.add(bilesen);
    }
    public void bilesenCikar(MenuBileseni bilesen){
        RestoranMenusu.remove(bilesen);

    }
    @Override
    public void goster(){
        System.out.println("ad:"+ad);
        for(MenuBileseni bilesen: RestoranMenusu){
            bilesen.goster();
        }
    }
    @Override
    public double ucretHesapla(){
    double toplam=0;
    for(MenuBileseni bilesen : RestoranMenusu ){
        toplam+= bilesen.ucretHesapla();
    }
    return toplam;
    }
    @Override
    public String getAd(){
        return ad;
    }

    public List<MenuBileseni> getBilesenler() {
        return RestoranMenusu;
    }

}
