import java.util.ArrayList;
import java.util.List;
public class Ekip implements IKurumsalBirim {
    private String ad;
    private List<IKurumsalBirim> altBirimler= new ArrayList<>();
    public Ekip(String ad){
        this.ad=ad;
    }
    public void calisanEkle(IKurumsalBirim calisan){
        altBirimler.add(calisan);

    }
    public void calisanCikar(IKurumsalBirim calisan){
        altBirimler.remove(calisan);
    }
    @Override
    public double maasHesapla(){
        double toplam=0;
        for(IKurumsalBirim calisan:altBirimler){
            toplam += calisan.maasHesapla();
        }
        return toplam;
    }

    @Override
    public void goster() {
        System.out.println("Ekip:" +ad);
        for(IKurumsalBirim calisan: altBirimler){
             calisan.goster();
        }

    }
}
