//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class yildizlarlaucgen {
    public static void main(String[] args) {
        int satir = 5;

        for (int i = 1; i <= satir; i++) {          // Satırları kontrol eder
            for (int j = 1; j <= i; j++) {          // Her satırda kaç yıldız olacağını kontrol eder
                System.out.print("*");              // Yıldızı yazdır
            }
            System.out.println();                    // Satır sonuna gelince alt satıra geç
        }
    }
}