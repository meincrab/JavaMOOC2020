
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus: ");
        String name = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String password = lukija.nextLine();

        if ((name.equals("aleksi") && password.equals("tappara")) || (name.equals("elina") && password.equals("kissa"))) {
            System.out.println("Olet kirjautunut järjestelmään");
        }
        else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }

    }
}
