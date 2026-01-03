public class Dikdortgen extends Sekil{
    private double en,boy;
    public Dikdortgen (double en,double boy){
        this.en=en;
        this.boy=boy;
    }
    @Override
    public double alanHesapla(){
        return en * boy;
    }
}
