public class ZorDusmanFabrikasi extends DusmanFabrikasi{
    @Override
    public Dusman dusmanUret(){
        return new Vampir();
    }
}
