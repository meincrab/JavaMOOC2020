
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String fileName = lukija.nextLine();

        int matches = 0;
        int wins = 0;
        int loss = 0;
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String teamName = lukija.nextLine();
        try ( Scanner pathLukija = new Scanner(Paths.get(fileName))) {
            while (pathLukija.hasNextLine()) {
                String rivi = pathLukija.nextLine();
                String[] palat = rivi.split(",");
                String nimi1 = palat[0];
                String nimi2 = palat[1];
                int score1 = Integer.valueOf(palat[2]);
                int score2 = Integer.valueOf(palat[3]);
                /*int ika = Integer.valueOf(palat[1]);
                if(ika == 1){
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                }else{
                System.out.println(nimi + ", ikä: " + ika + " vuotta");
                }*/
                if (nimi1.equals(teamName) || nimi2.equals(teamName)) {
                    matches += 1;
                    if (nimi1.equals(teamName) && score1 > score2) {
                        wins += 1;
                    }
                    if (nimi2.equals(teamName) && score2 > score1) {
                        wins += 1;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Virhe!");
        }
        System.out.println("Otteluita: " + matches);
        System.out.println("Voittoja: " + wins);
        System.out.println("Tappioita: " + (matches - wins));
    }
}
