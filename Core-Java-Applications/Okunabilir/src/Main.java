public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Fareler ve İnsanlar", "John Steinbeck", 566);
        EKitap ekitap = new EKitap("Kürk Mantolu Madonna", "Sabahattin Ali", 240, 6.3);
        SesliKitap sesliKitap = new SesliKitap("programlama dilleri","ali",250,2.5);

        System.out.println("--- Kitap İslemleri ---");
        kitap.oku();
        kitap.bilgileriYazdir();

        System.out.println("\n--- EKitap İslemleri ---");
        ekitap.oku();
        ekitap.indir();
        ekitap.bilgileriYazdir();

    System.out.println("\n--- Sesli Kitap İslemleri---");
        sesliKitap.oku();
        sesliKitap.indir();
        sesliKitap.bilgileriYazdir();

        System.out.println("Süre 10 saatten az mı ? "+sesliKitap.suryiKontrolEt);
}

}
