import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MenuTest {
    public static void main(String[] args) {


        Menu corbalar = new Menu("Çorbalar");
        corbalar.bilesenEkle(new MenuItem("Mercimek Çorbası", 80));
        corbalar.bilesenEkle(new MenuItem("Yayla Çorbası", 100));

        Menu anaYemekler = new Menu("AnaYemekler");
        anaYemekler.bilesenEkle(new MenuItem("Adana Kebap", 250));
        anaYemekler.bilesenEkle(new MenuItem("Urfa Kebabı", 300));


        Menu serbetliTatli = new Menu("Şerbetli Tatlilar");
        serbetliTatli.bilesenEkle(new MenuItem("Şöbiyet", 150));


        Menu serbetsizTatlilar = new Menu("Şerbetsiz Tatlilar");
        serbetsizTatlilar.bilesenEkle(new MenuItem("sütlac", 200));
        serbetsizTatlilar.bilesenEkle(new MenuItem("Kazandibi", 250));

        Menu tatlilar = new Menu("Tatlilar");
        tatlilar.bilesenEkle(serbetliTatli);
        tatlilar.bilesenEkle(serbetsizTatlilar);

        Menu anaMenu = new Menu("Ana Menü");
        anaMenu.bilesenEkle(corbalar);
        anaMenu.bilesenEkle(tatlilar);
        anaMenu.bilesenEkle(anaYemekler);
        // === an.ana katagori seçtirme ===


        // Ana Menü
        Scanner scanner = new Scanner(System.in);
        List<MenuBileseni> secilenYemekler = new ArrayList<>();
        double toplamUcret = 0;

        System.out.println("=== Restoran Menüsü Sipariş ===\n");

        // Ana Menüdeki her ana kategori için döngü (Sizin değişken isminizle: katagoriler)
        List<MenuBileseni> katagoriler = anaMenu.getBilesenler();

        for (MenuBileseni kategori : katagoriler) {
            // Sadece alt menü (Menu) olanlardan seçim yaptırılır.
            if (kategori instanceof Menu) {
                Menu currentMenu = (Menu) kategori;

                System.out.println("\n--- " + currentMenu.getAd() + " Seçimi ---");
                List<MenuBileseni> altOgeler = currentMenu.getBilesenler();

                // Eğer Tatlılar gibi iç içe menüler varsa, alt menüleri de listeler.
                for (int i = 0; i < altOgeler.size(); i++) {
                    System.out.println((i + 1) + ". " + altOgeler.get(i).getAd() +
                            " (Toplam Fiyat: " + altOgeler.get(i).ucretHesapla() + " TL)");
                }

                int secim = -1;
                boolean gecerliSecim = false;

                while (!gecerliSecim) {
                    System.out.print("Lütfen " + currentMenu.getAd() + " grubundan bir seçim yapın (1-" + altOgeler.size() + "): ");
                    if (scanner.hasNextInt()) {
                        secim = scanner.nextInt();
                        if (secim >= 1 && secim <= altOgeler.size()) {
                            gecerliSecim = true;
                        } else {
                            System.out.println("Geçersiz numara. Lütfen aralıktaki bir sayıyı girin.");
                        }
                    } else {
                        System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
                        scanner.next(); // Hatalı girişi temizle
                    }
                }

                MenuBileseni secilenOge = altOgeler.get(secim - 1);

                // Seçilen öğeyi (Menu ya da MenuItem) listeye ekle
                secilenYemekler.add(secilenOge);
                toplamUcret += secilenOge.ucretHesapla(); // Composite sayesinde alt menünün (Tatlılar) bileşenlerinin fiyatı toplanır
                System.out.println("-> Seçildi: " + secilenOge.getAd());

            }
        } // Ana döngü sonu

        // ===========================================
        // Sipariş Özeti
        System.out.println("\n*** SİPARİŞ ÖZETİ ***");
        for (MenuBileseni item : secilenYemekler) {
            System.out.println("- " + item.getAd() + " : " + item.ucretHesapla() + " TL");
        }
        System.out.println("-------------------------");
        System.out.println("** TOPLAM ÖDENECEK ÜCRET: " + toplamUcret + " TL **");

        scanner.close();


    }
}