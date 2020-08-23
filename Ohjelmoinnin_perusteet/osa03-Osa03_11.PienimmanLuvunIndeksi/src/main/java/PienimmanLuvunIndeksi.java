
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        /*72
        2
        8
        8
        11
        9999

        Pienin luku on 2
        Pienin luku löytyy indeksistä 1*/
        ArrayList<Integer> luvut = new ArrayList<>();
        int userInput = Integer.valueOf(lukija.nextLine());
        int pienin = userInput;
        luvut.add(pienin);
        while(true){
            userInput = Integer.valueOf(lukija.nextLine());
            if(userInput == 9999){
                break;
            }
            if(pienin > userInput){
                pienin = userInput;
            }
            luvut.add(userInput);
        }
        System.out.println("Pienin luku on " + pienin);    
        for(int i = 0; i < luvut.size(); i++){
            if(luvut.get(i)== pienin){
                System.out.println("Pienin luku löytyy indeksistä " + i);
            }
        }
    }
}
