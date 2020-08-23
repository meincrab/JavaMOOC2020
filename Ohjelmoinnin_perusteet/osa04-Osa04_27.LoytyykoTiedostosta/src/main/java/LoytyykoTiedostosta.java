
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        // toteuta tiedoston lukeminen tässä.
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Tiedoston: " + tiedosto + " lukeminen epäonnistui.");

        }
         while (true) {
            if (etsittava.isEmpty()) {
                break;
            }

            if (lista.contains(etsittava)) {
                System.out.println("Löytyi!");
                break;
            } else {
                System.out.println("Ei löytynyt.");
                break;
            }
        }
    }
}
