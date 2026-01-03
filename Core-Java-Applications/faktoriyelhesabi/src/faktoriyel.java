//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner ;
public class faktoriyel {
    public static void main(String[] args) {
    Scanner giris =new Scanner(System.in);
    System.out.print("faktöriyelini hesaplamak istediğniz sayiyi giriniz:");
    int sayi= giris.nextInt();
    int faktoriyel=1;
    for(int i=1; i <=sayi;i++){
      faktoriyel=faktoriyel*i;
    }
    System.out.println(sayi+"!= "+faktoriyel);
        giris.close();
    }

}