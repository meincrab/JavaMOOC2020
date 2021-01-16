
import java.util.Scanner;

public class Kayttoliittyma {

    private Tehtavalista tehtavalista;
    private Scanner lukija;

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }

    public void kaynnista() {
        while (true) {
            System.out.print("Komento:");
            String input = lukija.nextLine();
            if (input.equals("lopeta")) {
                break;
            }
            if (input.equals("lisaa")) {
                System.out.print("Lisättävä:");
                String lisattava = lukija.nextLine();
                tehtavalista.lisaa(lisattava);
            }
            if (input.equals("poista")) {
                System.out.print("Mikä poistetaan?");
                int poistettava = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(poistettava);
            }
            if (input.equals("listaa")) {
                tehtavalista.tulosta();
            }
        }
    }
}
