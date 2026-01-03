//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. ArrayList oluşturma ve eleman ekleme
        System.out.println("=== ArrayList Örneği ===\n");

        List<String> sehirler = new ArrayList<>();
        // eleman ekleme
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Antalya");

        // Diğer Listelerin Tanımlanması (Hatalar düzeltildi)
        List<Integer> yaslar = new ArrayList<>(Arrays.asList(25, 30, 28, 35, 22));
        List<Double> notlar = new ArrayList<>(Arrays.asList(85.5, 92.0, 78.5, 88.0, 95.5));

        // Listeleri Görüntüleme
        System.out.println("Şehirler Listesi (" + sehirler.size() + " eleman): " + sehirler);
        System.out.println("Yaşlar Listesi: " + yaslar);
        System.out.println("Notlar Listesi: " + notlar);
        System.out.println();

        // 2. DÖNGÜLERLE GÖRÜNTÜLEME
        System.out.println("1. FOR DÖNGÜSÜ İLE GÖRÜNTÜLEME:");
        forDongusu(sehirler);

        System.out.println("\n2. FOR-EACH DÖNGÜSÜ İLE GÖRÜNTÜLEME:");
        forEachDongusu(sehirler);

        System.out.println("\n3. ITERATOR İLE GÖRÜNTÜLEME:");
        iteratorDöngüsü(sehirler);

        System.out.println("\n--- Yaş Listesi İçin Özel Yazdırma ---");
        // yasListesiYazdir() çağrısı düzeltildi, yaslar listesi parametre olarak gönderildi
        yasListesiYazdir(yaslar);

        // 4. Ekstra İşlemler
        ekstraİşlemler(sehirler);
    }

    // 2.1. Normal For Döngüsü Metodu
    public static void forDongusu(List<String> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.println((i + 1) + ". " + liste.get(i));
        }
    }

    // 2.2. For-Each Döngüsü Metodu
    public static void forEachDongusu(List<String> liste) {
        int sira = 1;
        for (String sehir : liste) {
            System.out.println(sira++ + ". " + sehir);
        }
    }

    // 3. Iterator ile döngü Metodu
    public static void iteratorDöngüsü(List<String> liste)
    {
        Iterator<String> iterator = liste.iterator();
        int sira = 1;
        while (iterator.hasNext()) {
            System.out.println(sira++ + ". " + iterator.next());
        }
    }

    // 4. Yaş listesi için özel yazdırma Metodu
    public static void yasListesiYazdir(List<Integer> yaslar) {
        System.out.println("Sıra No | Yaş | Durum");
        System.out.println("-------|-----|-------");

        for (int i = 0; i < yaslar.size(); i++) {
            int yas = yaslar.get(i);
            // Ternary operator düzeltildi
            String durum = (yas < 25) ? "Genç" : (yas < 35) ? "Yetişkin" : "Olgun";

            System.out.printf("%7d | %3d | %s%n", (i + 1), yas, durum);
        }
    }

    // 5. Ekstra List İşlemleri Metodu (Tamamlandı)
    public static void ekstraİşlemler(List<String> sehirler) {
        System.out.println("\n--- Ekstra List İşlemleri ---");

        // Eleman silme
        sehirler.remove("Bursa");
        System.out.println("Bursa silindikten sonra: " + sehirler);

        // Eleman arama
        boolean varMi = sehirler.contains("İstanbul");
        System.out.println("\"İstanbul\" var mı? " + varMi);

        // Sıralama
        List<String> kopya = new ArrayList<>(sehirler);
        Collections.sort(kopya);
        System.out.println("Sıralanmış: " + kopya);

        // Ters sıralama
        Collections.reverse(kopya);
        System.out.println("Ters sıralama: " + kopya);

        // Boşaltma
        kopya.clear();
        System.out.println("Clear sonrası boyut:  " + kopya.size()); // Kontrol amaçlı eklendi
    }
    import java.util.HashMap ;
    import java.util.Map;
    public static void main(String[] args){
        map<integer,String kitapİD()=new HashMap<>();
        kitapİD.put(i,"java programlama");
        System.out.println(Kitap ID VE Adları)
    }
}
// hashSet çalış


