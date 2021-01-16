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

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista(){
        while(true) {
            System.out.print("Komento:");
            String komento = lukija.nextLine();
            if(komento.equals("lopeta")){
                System.out.println("Hei hei!");
                break;
            }
            else if(komento.equals("lisaa")){
                System.out.print("Sana:");
                String sana = lukija.nextLine();
                System.out.print("Käännös:");
                String kaannos = lukija.nextLine();
                sanakirja.lisaa(sana, kaannos);
            }
            else if(komento.equals("hae")){
                System.out.print("Haettava:");
                String haettava = lukija.nextLine();
                if(sanakirja.kaanna(haettava) == null){
                    System.out.println("Sanaa " + haettava + " ei löydy");
                }else {
                    System.out.println(sanakirja.kaanna(haettava));
                }
                
            }
            else{
                System.out.println("Tuntematon komento");
            }
        }
    }
    
    
}
