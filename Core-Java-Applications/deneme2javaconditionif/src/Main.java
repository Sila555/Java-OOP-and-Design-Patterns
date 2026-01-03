//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("lütfen kilomuzu giriniz:");


        Scanner scanner = new Scanner(System.in);
        try {
            int weight = scanner.nextInt();
            System.out.println("lütfen boyunuzu giriniz:");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            System.out.println("BMİ değeriniz :" + bmi);

            String status="";
            if(bmi<18.5){
                status= "ZAYİF";
            }
            else if(bmi >=18.5 && bmi<=24.9){
                status=("NORMAL KİLO");
            }
            else if(bmi>=30 && bmi<=29.9){
                status="dazla kilolu";
            }
            else if(bmi>=30 && bmi >= 34.9){
                status="1. derece obez";
            }
            else{
                status="Moroid obez";
            }
            System.out.println("BMİ yorumunuz :"+ status);

        }
        catch (InputMismatchException ex) {
            System.out.println("lütfen kilo için tam ssyı boy için virgül ile ayrılmış ondalıklı sayıyı giriniz:");

        }
        catch(ArithmeticException ex){
            System.out.println("tam sayılar 0 a bölünemez.");
        }
        catch (Exception exception){
            System.out.println("Bilinmeyen bir hata meydana geldi :hata mesajı:");
            System.out.println(exception.getMessage());

        }

    }
}