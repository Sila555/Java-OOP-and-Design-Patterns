public class Main {
    public static void main(String[] args) {
        Kopek k1 = new Kopek("Karabaş", "Golden", 5);
        Kedi k2 = new Kedi("Pamuk", "Tekir", 3, "Beyaz");

        System.out.println(k1.getAd() + " (" + k1.getCins() + ", " + k1.getYas() + " yaşında)");
        k1.sesCikar();

        System.out.println(k2.getAd() + " (" + k2.getCins() + ", " + k2.getYas() + " yaşında, tüy rengi: " + k2.getTuyRengi() + ")");
        k2.sesCikar();

        System.out.println("\n--- Yaş güncellemesi yapılıyor ---");
        k1.setYas(6);
        k2.setYas(4);

        System.out.println(k1.getAd() + " artık " + k1.getYas() + " yaşında.");
        System.out.println(k2.getAd() + " artık " + k2.getYas() + " yaşında.");
    }
}

