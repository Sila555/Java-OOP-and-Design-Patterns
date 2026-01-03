public class DecoratorTest {
    public static void main(String[] args){
        Kahve sade=new SadeKahve();
        Kahve sutlu= new SutluKahve(sade);
        Kahve sekerliSutlu=new SekerliKahve(sutlu);
        System.out.println(sekerliSutlu.getTanimi()+", Fiyat: "+ sekerliSutlu.getFiyat());
    }
}
