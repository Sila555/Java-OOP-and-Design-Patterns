//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

 import java.util.Scanner;
        public class carpmaProgrami {
            public static void main(String[] args) {
                Scanner giris = new Scanner(System.in);
                System.out.print("Birinci sayıyı giriniz: ");
                int sayi1 = giris.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int sayi2 = giris.nextInt();
                int carpma = sayi1 * sayi2;
                System.out.println("Carpma: " + carpma);
                giris.close();
            }
        }

