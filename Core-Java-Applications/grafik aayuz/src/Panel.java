import java.util.ArrayList;
import java.util.List;

public class Panel implements IGUIBilesen {
    private String ad;
    public Panel(String ad){
        this.ad=ad;
    }
    private  List <IGUIBilesen> altBilesenler = new ArrayList<>();

    public void bilesenEkle(IGUIBilesen bilesen){
        altBilesenler.add(bilesen);
    }

    public void bilesenCikar(IGUIBilesen bilesen) {
        altBilesenler.remove(bilesen);

    }
        @Override
        public void ciz(){
            System.out.println("panel çiziliyor: " +ad);



        for(IGUIBilesen bilesen : altBilesenler){
            bilesen.ciz();
        }
    }
}
