
import java.util.Scanner;

public class Keskustelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Hyvää päivää! Mitä kuuluu?");
        String userInput = lukija.nextLine();
        System.out.println("No mutta sepäs kiinnostavaa, kerro lisää!");
        userInput = lukija.nextLine();
        System.out.println("Kiitos kertomastasi!");
    }
}
