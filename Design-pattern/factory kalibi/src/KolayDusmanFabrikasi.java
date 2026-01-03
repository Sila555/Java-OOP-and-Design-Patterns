public class KolayDusmanFabrikasi extends DusmanFabrikasi{
    @Override
    public Dusman dusmanUret(){
        return new Zombi();
    }
}
