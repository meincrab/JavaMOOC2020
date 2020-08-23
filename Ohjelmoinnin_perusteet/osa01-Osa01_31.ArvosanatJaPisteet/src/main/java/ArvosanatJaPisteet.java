
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna pisteet [0-100]:");
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku < 0) {
            System.out.println("mahdotonta!");
        } else if (luku < 50) {
            System.out.println("hylätty");
        } else if (luku < 60) {
            System.out.println("1");
        } else if (luku < 70) {
            System.out.println("2");
        } else if (luku < 80) {
            System.out.println("3");
        } else if (luku < 90) {
            System.out.println("4");
        } else if (luku <= 100) {
            System.out.println("5");
        } else {
            System.out.println("uskomatonta!");
        }
    }
}
