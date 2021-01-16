/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
import java.util.Scanner;

public class Kayttoliittyma {

    private Vitsipankki vitsit;
    private Scanner lukija;

    public Kayttoliittyma(Vitsipankki vitsit, Scanner lukija) {
        this.vitsit = vitsit;
        this.lukija = lukija;
    }

    public void kaynnista() {
        while (true) {
            System.out.print("Komennot:\n1 - lisää vitsi\n2 - arvo vitsi\n3 - listaa vitsit\nX - lopeta\n");
            String luettu = lukija.nextLine();
            if (luettu.equals("X")) {
                break;
            }
            if(luettu.equals("1")){
                System.out.println("Kirjoita lisättävät vitsi:");
                luettu = lukija.nextLine();
                vitsit.lisaaVitsi(luettu);
            }
            if(luettu.equals("2")){
                System.out.println(vitsit.arvoVitsi());
            }
            if(luettu.equals("3")){
                System.out.println("Tulostetaan vitsit.");
                vitsit.tulostaVitsit();
            }
            
        }
    }

}
