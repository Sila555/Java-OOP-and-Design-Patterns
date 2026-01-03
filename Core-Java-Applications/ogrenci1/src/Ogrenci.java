//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ogrenci {
    private String isim;
    private int yas;
    private double notOrtalamasi;
    private String OgrenciNo;
    public Ogrenci(String isim, int yas, double notOrtalamasi,String OgrenciNo) {
        this.isim = isim;
        this.yas = yas;
        this.notOrtalamasi = notOrtalamasi;
        this.OgrenciNo=OgrenciNo;
    }
    public String getIsim() {
        return isim; }
    public void setIsim(String isim) {
        this.isim = isim; }
    public String getOgrenciNo(){
        return OgrenciNo;}
    public void setOgrenciNo(String OgrenciNo){
        this.OgrenciNo=OgrenciNo;
    }
    public double getnotOrtalamasi(){
        return notOrtalamasi;
    }
    public void notEkle(double not) {
        if (not >= 0 && not <= 100) {
            this.notOrtalamasi = (this.notOrtalamasi + not) / 2;
        }
    }
    public void gectiMi(double notOrtalamasi){
        if(this.notOrtalamasi >=50){
            System.out.print("tebrikler gecttiniz.");
        }else{
            System.out.print("maalesef kaldiniz.");
        }
    }
    public void bilgileriYazdir() {
        System.out.println("Isim: " + isim + ", Yas: " + yas +
                ", Not: " + notOrtalamasi+ ",OgrenciNo: "+ OgrenciNo);
    }
}