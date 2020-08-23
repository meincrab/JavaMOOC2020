
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String userWord = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int userNumber = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double userDouble = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean userBool = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon " + userWord);
        System.out.println("Syötit kokonaisluvun " + userNumber);
        System.out.println("Syötit liukuluvun " + userDouble);
        System.out.println("Syötit totuusarvon " + userBool);
    }
}
