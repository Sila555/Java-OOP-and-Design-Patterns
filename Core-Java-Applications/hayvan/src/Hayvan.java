// Hayvan sınıfı ve Kopek, Kedi alt sınıfları tasarlayın (kalıtım):
// sesCikar metodu özelleştirilsin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hayvan{
    private String ad;
    private String cins;
    private int yas;
    public Hayvan(String ad,String cins,int yas){
        this.ad=ad;
        this.cins=cins;
        this.yas=yas;
    }
    public void sesCikar(){
        System.out.println("bu hayvan ses çıkarıyor.");
        // sen buraya çıktı yazmamıştın.
    }
    public String getAd (){
        return ad;
    }
    public String getCins(){

        return cins;
    }
    public int getYas(){
        return yas;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public void setCins(String cins){
        this.cins=cins;
    }
    public void setYas(int yas){
        if(yas>=0){
            this.yas=yas;
        }else{
            System.out.println("yaş negatif olamaz!");
        }
    }

}
