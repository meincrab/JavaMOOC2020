
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random arpoja = new Random();
        
        System.out.println("Montako numeroa tulostetaan?");
        int syote = Integer.parseInt(lukija.nextLine());
        for(int i =0; i < syote; i++){
            System.out.println(arpoja.nextInt(11));
        }
    }

}
