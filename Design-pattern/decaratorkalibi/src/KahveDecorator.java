public  abstract class KahveDecorator implements Kahve{
    protected Kahve kahve;
    public KahveDecorator(Kahve kahve){
        this.kahve=kahve;
    }
    public double getFiyat(){
        return kahve.getFiyat();
    }
    public String getTanimi(){
        return kahve.getTanimi();
    }

}
