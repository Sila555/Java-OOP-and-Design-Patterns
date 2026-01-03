//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankaHesabi {
    private String hesapNo;
    private double bakiye;

    public BankaHesabi(String hesapNo, double bakiye) {
        this.bakiye = bakiye;
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar) { //Metot parametreleri, metot çağrıldığında dışarıdan değer alan ve metot içinde tanımlı olan yerel değişkenler gibi davranır.
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + "TL yatırıldı.");
        }
    }

    public void paraCEK(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + "TL çekildi. ");
        } else {
            System.out.println("bakiye yetersiz");
        }
    }

    public static void main(String[] args) {
        BankaHesabi bankahesabi = new BankaHesabi("TR123456", 1000.0);
        System.out.println("Başlangıç bakiyesi: " + bankahesabi.getBakiye() + "TL");
        bankahesabi.paraYatir(500);
        bankahesabi.paraCEK(200);
        bankahesabi.paraCEK(100);
    }
}