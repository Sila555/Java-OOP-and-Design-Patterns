public class Kedi extends Hayvan{
    public String tuyRengi;
    public Kedi (String ad,String cins,int yas,String tuyRengi){
        super(ad,cins,yas);
        this.tuyRengi=tuyRengi;

    }
    @Override
    public void sesCikar()
    {
        System.out.println("miyav");
    }
    public String getTuyRengi (){
        return tuyRengi ;
    }
    public void setTuyRengi(String tuyRengi ){
        this.tuyRengi=tuyRengi ;

    }
}
