
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int number1 = Integer.valueOf(lukija.nextLine());
        int number2 = Integer.valueOf(lukija.nextLine());

        if (number1 > number2) {
            System.out.println("Luku " + number1 + "on suurempi kuin luku " + number2 + ".");
        } else if (number1 < number2) {
            System.out.println("Luku " + number1 + "on pienempi kuin luku " + number2 + ".");
        } else {
            System.out.println("Luku " + number1 + "on yhtä suuri kuin luku " + number2 + ".");
        }

    }
}
