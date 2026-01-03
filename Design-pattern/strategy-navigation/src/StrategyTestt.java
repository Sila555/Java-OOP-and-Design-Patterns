public class StrategyTestt {
  public  static void main(String [] args) {
      Navigasyon navi = new Navigasyon(new ArabaRotasi());
      System.out.println("--- İlk Durum ---");
      navi.rotaOlustur("Kadıköy", "Beşiktaş");

      navi.setRotaHesaplama(new YuruyusRotasi());

      System.out.println("\n--- Karar Değişti ---");
      navi.rotaOlustur("Kadıköy", "Beşiktaş");

      navi.setRotaHesaplama(new BisikletRotasi());
      System.out.println("\n--- Hava Güzel ---");
      navi.rotaOlustur("Kadıköy", "Beşiktaş");
  }
}
