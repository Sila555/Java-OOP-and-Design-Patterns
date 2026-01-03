public class SekerliKahve extends KahveDecorator {
    public SekerliKahve(Kahve kahve){
        super(kahve);
    }

    @Override
    public double getFiyat() {
        return super.getFiyat() +  1.0;
    }
    public String getTanimi(){
        return super.getTanimi() + " ,Şekerli";
    }
}
