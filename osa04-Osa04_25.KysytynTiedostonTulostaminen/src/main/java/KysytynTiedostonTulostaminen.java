
import java.nio.file.Paths;
import java.util.Scanner;
import javax.print.DocFlavor;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String fileName = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(fileName))){
            while(tiedostonLukija.hasNextLine()){
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi);
            }
        }
        catch ( Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
