public class FactoryMethodTest {
    public static void main (String [] args){
        DusmanFabrikasi kolayFabrika = new KolayDusmanFabrikasi() ;
        DusmanFabrikasi zorFabrika =new ZorDusmanFabrikasi();
        Dusman kolayDusman=kolayFabrika.dusmanUret();
        Dusman zorDusman=zorFabrika.dusmanUret();
        kolayDusman.saldir();
        zorDusman.saldir();


    }
}
