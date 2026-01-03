public class Kopek extends Hayvan {
    private int  yas;
    public  Kopek(String ad,String cins,int yas){
        super(ad,cins,yas);
    }

    @Override
    public void sesCikar() {
        System.out.println("hav hav");
    }
}
