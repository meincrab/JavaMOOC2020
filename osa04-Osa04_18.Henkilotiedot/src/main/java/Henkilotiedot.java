
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Etunimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            System.out.print("Henkilötunnus: ");
            String hetu = lukija.nextLine();
            
            henkilotiedot.add(new Henkilotieto(nimi, sukunimi, hetu));
            
        }
        
        for(Henkilotieto henkilotieto : henkilotiedot){
            System.out.println("");
            System.out.println(henkilotieto.getEtunimi() + " " +  henkilotieto.getSukunimi());
        }
    }
}
