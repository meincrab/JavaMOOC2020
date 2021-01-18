
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArvosanaTilastot tilastot = new ArvosanaTilastot();
        UserInterface ui = new UserInterface(lukija, tilastot);
        ui.start();
    }
}
