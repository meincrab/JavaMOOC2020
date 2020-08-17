
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        String nimi = "Random";
        while(true){
            System.out.print("Nimi: ");
            nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            System.out.print("Pituus:");
            int pituus = Integer.valueOf(lukija.nextLine());
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        
        System.out.println("");
        System.out.print("Ohjelman maksimipituus?");
        int pituus = Integer.valueOf(lukija.nextLine());
        
        for(TelevisioOhjelma ohjelma : ohjelmat){
            if(ohjelma.getPituus() <= pituus){
                System.out.println(ohjelma.getNimi() + ", " + ohjelma.getPituus() + " minuuttia");
            }
        }

    }

}
