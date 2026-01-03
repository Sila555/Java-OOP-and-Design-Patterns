//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class EnBuyukSayi{
    public static void main(String[] args) {
    Scanner giris =new Scanner(System.in);
    int sayi;
    int enBuyuk=0;
    System.out.println("sayilari girin(bitirmek icin 0 girin):");
    sayi=giris.nextInt();
    while(sayi !=0){
        if(sayi>enBuyuk){
            enBuyuk=sayi;
        }
        sayi=giris.nextInt();
    }
    System.out.println("Girilen en buyuk sayi: "+enBuyuk);
    giris.close();
    }
}