//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VeritabaniBaglantisi {
    private static VeritabaniBaglantisi instance ;
    private VeritabaniBaglantisi(){
        System.out.println("Veri bağlantısı oluşturuldu.");
    }
    public static VeritabaniBaglantisi getInstance(){
        if(instance==null){
            instance=new VeritabaniBaglantisi();
        }
        return instance;
    }
    public void baglan(){
        System.out.println("Veri tabanına bağlanıldı.");
    }

}