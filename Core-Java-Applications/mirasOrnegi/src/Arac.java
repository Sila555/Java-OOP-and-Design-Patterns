//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arac {
    protected String marka;
    protected int hiz;

    public Arac(String marka, int hiz) {
        this.marka = marka;
        this.hiz = hiz;
    }

    public void bilgiYazdir() {
        System.out.println("Marka: " + marka + " , Hız: " + hiz);
    }
}



