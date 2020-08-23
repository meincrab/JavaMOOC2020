
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        while(true){
            System.out.print("Nimi: ");
            String name = lukija.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Sivuja: ");
            int pages = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi: ");
            int relYear = Integer.valueOf(lukija.nextLine());    
            kirjat.add(new Kirja(name, pages, relYear));
        }
       
        System.out.print("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        if(tulostus.equals("kaikki")){
            for(Kirja kirja : kirjat){
                System.out.println(kirja.toString());
            }
        }
        else if(tulostus.equals("nimi")){
            for(Kirja kirja : kirjat){
                System.out.println(kirja.getName());
            }
        }
    }
}
