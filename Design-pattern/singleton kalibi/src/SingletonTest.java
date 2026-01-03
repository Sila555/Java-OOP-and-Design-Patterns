public class SingletonTest {
    public static void main(String[] args){
        VeritabaniBaglantisi baglanti1=VeritabaniBaglantisi.getInstance();
        VeritabaniBaglantisi baglanti2=VeritabaniBaglantisi.getInstance();
        baglanti1.baglan();
        System.out.println("Aynı yerde mi ?"+(baglanti1==baglanti2));
    }
}
