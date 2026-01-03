public class MenuItem implements MenuBileseni {
    private String ad;
    private double  fiyat;
    public MenuItem(String ad,double fiyat){
        this.ad=ad;
        this.fiyat=fiyat;
    }

    @Override
    public void goster() {
        System.out.println(ad + "-" + fiyat + "TL");
    }
    @Override
    public double fiyatHesapla(){
        return fiyat;
    }
}
