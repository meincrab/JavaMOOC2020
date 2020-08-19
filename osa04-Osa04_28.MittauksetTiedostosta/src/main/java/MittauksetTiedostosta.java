
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int amount = 0;
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            // luetaan kaikki tiedoston rivit
            while (tiedostonLukija.hasNextLine()) {
                int value = Integer.valueOf(tiedostonLukija.nextLine());
                if(value <= ylaraja && value >=alaraja){
                    amount += 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston: " + tiedosto + " lukeminen epäonnistui.");

        }
        System.out.println("Lukuja: " + amount);
    }

}
