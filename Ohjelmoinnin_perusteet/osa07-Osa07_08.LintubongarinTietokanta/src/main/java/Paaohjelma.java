

import java.util.Scanner;


public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        LintuBongari lintuBongari = new LintuBongari();
        
        while(true){
            String kommento = lukija.nextLine();
            if(kommento.equalsIgnoreCase("lopeta")){
                break;
            }
            else if(kommento.equalsIgnoreCase("lisaa")){
                uusLintu(lukija, lintuBongari);
            }
            else if(kommento.equalsIgnoreCase("nayta")){
                lintuBongari.naytaKaikki();
            }
            else if(kommento.equalsIgnoreCase("tilasto")){
                break;
            }
            
        }
    }
    
    private static void lisaaTilastoon(Scanner lukija, LintuBongari lintuBongari){
        
    }
    private static void uusLintu(Scanner lukija, LintuBongari lintuBongari){
        System.out.println("Nimi:");
        String nimi = lukija.nextLine();
        System.out.println("Latinakielinen nimi:");
        String latinaNimi = lukija.nextLine();
        lintuBongari.uusLintu(nimi, latinaNimi);
    }
    

}
