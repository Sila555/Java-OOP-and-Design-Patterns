public class main{
    public static void main (String [] args){
        Calisan calisan1= new Calisan("Sıla",5000);
        Calisan calisan2= new Calisan("Ayşe",1000);
        Calisan calisan3=new Calisan("Fatma",2000);

        Ekip altBirimler=new Ekip("Parlayan yıldızlar");
        altBirimler.calisanEkle(calisan2);
        altBirimler.calisanEkle(calisan3);

        Ekip ustBirimler=new Ekip("Gökteki yağmurlar");
        ustBirimler.calisanEkle(calisan1);
        ustBirimler.calisanEkle(altBirimler);

        System.out.println("=== Dosya Sistemi===");
        ustBirimler.goster();
        System.out.println("Toplam maas: "+ ustBirimler.maasHesapla() + "KB");
    }
}
