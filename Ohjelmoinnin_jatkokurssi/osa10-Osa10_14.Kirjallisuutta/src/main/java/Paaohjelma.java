
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            String ika = lukija.nextLine();
            kirjat.add(new Kirja(nimi, Integer.valueOf(ika)));
            System.out.println("");
        }
        System.out.println("\nYhteensä " + kirjat.size() + " kirjaa");
        System.out.println("\nKirjat:");
        Comparator<Kirja> vertaileIkajaNimi = Comparator
                .comparing(Kirja::getKohdeIka)
                .thenComparing(Kirja::getNimi);
        Collections.sort(kirjat, vertaileIkajaNimi);
        kirjat.stream().forEach(System.out::println);
    }

}
