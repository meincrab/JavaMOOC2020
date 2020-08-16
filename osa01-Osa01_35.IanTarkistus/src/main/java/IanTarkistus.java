
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int age = Integer.valueOf(lukija.nextLine());
        System.out.println("Kuinka vanha olet?");
        if (age < 0 || age > 120) {
            System.out.println("Mahdotonta!");
        } else {
            System.out.println("OK");
        }
    }
}
