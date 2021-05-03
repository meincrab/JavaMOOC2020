
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }

    //nimi,julkaisuvuosi,sivujen lukumäärä,kirjoittaja
    public static List<Kirja> lueKirjat(String tiedosto) {
        List<Kirja> kirjojenKokoelma = new ArrayList<>();
        try {
            kirjojenKokoelma = Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(tiedot -> new Kirja(tiedot[0], Integer.valueOf(tiedot[1]), Integer.valueOf(tiedot[2]), tiedot[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return kirjojenKokoelma;
    }

}
