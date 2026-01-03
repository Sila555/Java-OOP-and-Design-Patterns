public class grafikArayuz {
    public static void  main(String[] args){
        Dugme dugme1=new Dugme("kaydet");
        Dugme dugme2= new Dugme("silmek");
        Dugme dugme3=new Dugme("oluşturmak");

        Panel altPanel=new Panel("AkSİYON PANELİ");
        altPanel.bilesenEkle(dugme2);
        altPanel.bilesenEkle(dugme3);

        Panel kokPanel= new Panel("Ana Pencere");
        kokPanel.bilesenEkle(dugme1);
        kokPanel.bilesenEkle(altPanel);


        System.out.println("===GRAFİK ARAYÜZ SİSTEMİ===");
        kokPanel.ciz();


    }
}
