/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
import java.util.Scanner;

public class Kayttoliittyma {
    
    private Scanner lukija;
    private Tehtavalista tehtavalista;
    
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String kommento = lukija.nextLine();
            if (kommento.equalsIgnoreCase("lisaa")) {
                System.out.print("Lisättävä: ");
                kommento = lukija.nextLine();
                tehtavalista.lisaa(kommento);
            } else if (kommento.equalsIgnoreCase("listaa")) {
                tehtavalista.tulosta();
            } else if (kommento.equalsIgnoreCase("poista")) {
                System.out.print("Mikä poistetaan? ");
                kommento = lukija.nextLine();
                tehtavalista.poista(Integer.parseInt(kommento));
            }
            else if (kommento.equalsIgnoreCase("lopeta")){
                break;
            }
        }
    }
}
