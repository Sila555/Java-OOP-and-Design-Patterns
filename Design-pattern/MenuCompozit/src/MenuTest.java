

public class MenuTest{
    public static void main(String[] args){
        Menu Corbalar = new Menu("Corbalar");
        MenuItem Corba1= new MenuItem("Mercimek Çorbası",250);
        MenuItem Corba2= new MenuItem("Ezogelin Çorbası",200);
        MenuItem Corba3=new MenuItem("Yoğurt çorbası",150);


        Menu AnaYemek=new Menu("AnaYemek");
        MenuItem AnaYemek1= new MenuItem("Köfte patates",500);
        MenuItem AnaYemek2=new MenuItem("ızgara tavuk",400);
        MenuItem AnaYemek3= new MenuItem("Karnıyarık",450);


        Menu Tatli= new Menu("TATLİ");
        MenuItem Tatli1=new MenuItem("Baklava",600);
        MenuItem Tatli2=new MenuItem("triliçe",200);
        MenuItem Tatli3=new MenuItem("kazandibi",300);

        Menu AnaMenu=new Menu("Akşam Menüsü");
        AnaMenu.bilesenEkle(Corba1);
        AnaMenu.bilesenEkle(AnaYemek1);
        AnaMenu.bilesenEkle(Tatli1);

           AnaMenu.goster();
           System.out.println("Toplam fiyat: "+AnaMenu.fiyatHesapla()+"TL");
    }
}
