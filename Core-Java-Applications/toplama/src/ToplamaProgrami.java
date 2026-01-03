//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class ToplamaProgrami{
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz:");
        int sayi1=giris.nextInt();
        System.out.print("ikinci sayiyi girin:");
        int sayi2=giris.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("toplam:" +toplam);
        giris.close();
    }
}
