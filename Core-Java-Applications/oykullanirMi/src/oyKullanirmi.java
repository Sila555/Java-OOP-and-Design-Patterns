//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
public class oyKullanirmi{
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in) ;
        System.out.print("yasinizi girer misiniz:");
        int yas=giris.nextInt() ;
        if(yas>=18){
      System.out.print("oy kullanabilirsiniz.");
        }else{
            System.out.print("oy kullanamazsiniz");
        }
        giris.close() ;


    }
}