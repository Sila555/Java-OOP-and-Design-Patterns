public class MenuItem implements MenuBileseni {
    private String ad;
    private double ucret;

    public MenuItem(String ad, double ucret) {
        this.ad = ad;
        this.ucret = ucret;
    }

    @Override
    public void goster() {
        System.out.println("AD:" + ad + "Ucreti:" + ucret);
    }

    @Override
    public double ucretHesapla() {
        return ucret;
    }
    @Override
    public String getAd(){
        return ad;
    }

}













