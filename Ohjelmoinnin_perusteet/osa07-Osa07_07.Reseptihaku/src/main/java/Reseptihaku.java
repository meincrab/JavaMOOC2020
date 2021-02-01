
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();
        ArrayList<Resepti> reseptit = lueReseptitTiedostosta(tiedosto);
        System.out.println("Komennot:\n"
                + "listaa - listaa reseptit\n"
                + "lopeta - lopettaa ohjelman");
        while(true){
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            System.out.println("");
            if(komento.equalsIgnoreCase("lopeta")){
                break;
            }
            lueKomento(komento, reseptit, lukija);
        }
    }
    public static void lueKomento(String komento, ArrayList<Resepti> reseptit, Scanner syotto){
        if(komento.equalsIgnoreCase("listaa")){
            tulostaReseptit(reseptit);
            System.out.println("");
        }
    }
    public static void tulostaReseptit(ArrayList<Resepti> reseptit){
        System.out.println("Reseptit: ");
        for(Resepti resepti : reseptit){
            System.out.println(resepti.toString());
        }
    }
    public static ArrayList<Resepti> lueReseptitTiedostosta(String tiedostonNimi) {
        ArrayList<Resepti> reseptit = new ArrayList<>();
        ArrayList<String> reseptinOsat = new ArrayList<>();
        String reseptinNimi;
        int reseptinAika;
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedostonNimi))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                if (!rivi.isEmpty()) {
                    reseptinOsat.add(rivi);
                } else {
                    reseptinNimi = reseptinOsat.get(0);
                    reseptinAika = Integer.valueOf(reseptinOsat.get(1));
                    reseptinOsat.remove(0);
                    reseptinOsat.remove(0);
                    reseptit.add(new Resepti(reseptinNimi, reseptinAika, reseptinOsat));
                    reseptinOsat.clear();
                }
            }
            if (!reseptinOsat.isEmpty()) {
                reseptinNimi = reseptinOsat.get(0);
                reseptinAika = Integer.valueOf(reseptinOsat.get(1));
                reseptinOsat.remove(0);
                reseptinOsat.remove(0);
                reseptit.add(new Resepti(reseptinNimi, reseptinAika, reseptinOsat));
                reseptinOsat.clear();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return reseptit;

    }
}
