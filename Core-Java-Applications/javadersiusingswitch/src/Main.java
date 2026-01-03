//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Aşağıdaki trafik  ısıklarının birisini seçin:\n1.kırmmızı\n2.sarı\n3.yeşil\n lütfen seçiminizi sayi olarak yazın:");
        String choose =new Scanner(System.in).next();//birden fazla
        if(choose.equals("1")){
            System.out.println("dur");
        }
        else if(choose.equals("2")){
            System.out.println("dikkatli ol");
        }
        else if(choose.equals("3")){
            System.out.println("geç");
        }
        else{
            System.out.println("belirsiz işlem.....");
        }
        switch(choose){
            case "1":
            System.out.println("dur");
            break;
            case "2":
            System.out.println("dikkatli ol");
            break;
            case  "3":
            System.out.println("geç");
            break;
            default:
            System.out.println("geçersiz işlem....");
        }
    }
}