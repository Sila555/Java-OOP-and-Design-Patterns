//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci notunuzu giriniz: ");
        int not1 = giris.nextInt();
        System.out.print("İkinci notunuzu giriniz: ");
        int not2 = giris.nextInt();
        int notOrtalamasi = (not1 + not2)/2;
        System.out.println("Not Ortalaması: " + notOrtalamasi);
        giris.close();
    }
}