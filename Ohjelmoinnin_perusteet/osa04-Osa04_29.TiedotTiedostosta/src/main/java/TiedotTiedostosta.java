
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String fileName = lukija.nextLine();
        try (Scanner pathLukija = new Scanner(Paths.get(fileName))) {
            while (pathLukija.hasNextLine()) {
                String rivi = pathLukija.nextLine();

                String[] palat = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                if(ika == 1){
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                }else{
                System.out.println(nimi + ", ikä: " + ika + " vuotta");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Virhe!");
        }
        
    }
}
