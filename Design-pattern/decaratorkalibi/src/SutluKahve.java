public class SutluKahve extends KahveDecorator {
    public SutluKahve(Kahve kahve){
        super(kahve);
    }

    @Override
    public double getFiyat() {
        return super.getFiyat() + 2.0;
    }

    @Override
    public String getTanimi() {
        return super.getTanimi() + ", Sütlü";
    }
}
