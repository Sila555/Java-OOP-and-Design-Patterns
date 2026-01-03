import java.util.Scanner;
public class OgrenciTest {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Ogrenci ismi: ");
        String isim = giris.nextLine();
        System.out.print("OgrenciNo: ");
        String OgrenciNo=giris.nextLine();
        System.out.print("Ogrenci yasi: ");
        int yas = giris.nextInt();
        System.out.print("Not ortalamasi: ");
        double not = giris.nextDouble();
        Ogrenci ogrenci = new Ogrenci(isim, yas, not,OgrenciNo);
        System.out.print("Yeni not giriniz: ");
        double yeniNot = giris.nextDouble();
        ogrenci.notEkle(yeniNot);
        ogrenci.bilgileriYazdir();
        ogrenci.gectiMi(not);
        giris.close();
    }
}
