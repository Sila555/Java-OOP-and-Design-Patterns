//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList ;
import java.util.List;         //
public class ArrayListOrnek {
    public static void main(String[] args) {
        List <String> kitaplar =new ArrayList<>();
        kitaplar.add("Java Programlama");//add metodu sayesinde java programlamayı gönderebiliyorum sıradaki elamanı olarak ve indisi de 0 dır.
        kitaplar.add("Algoritmalar");
        kitaplar.add("programlama dili");
        System.out.println("Kitaplar : "+kitaplar);
        kitaplar.remove(0);
        System.out.println("Güncel :"+kitaplar);
        kitaplar.remove(0);
        System.out.println(" enGüncel :"+kitaplar);

    }
}