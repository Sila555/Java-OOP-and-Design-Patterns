public class Daire extends Sekil{
    private double yaricap;
    public Daire (double yaricap){
        this.yaricap=yaricap;
    }
    @Override
    public double alanHesapla(){
        return Math.PI*yaricap*yaricap;
    }
}

