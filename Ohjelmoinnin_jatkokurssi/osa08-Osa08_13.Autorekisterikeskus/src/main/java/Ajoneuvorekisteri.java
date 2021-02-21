
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meincrab
 */
public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistaja;
    
    public Ajoneuvorekisteri(){
        this.omistaja = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (this.omistaja.get(rekkari) == null) {
            this.omistaja.put(rekkari, omistaja);
            return true;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (this.omistaja.containsKey(rekkari)) {
            return this.omistaja.get(rekkari);
        }
        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistaja.containsKey(rekkari)) {
            this.omistaja.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for(Rekisterinumero avain:this.omistaja.keySet()){
            System.out.println(avain);
        }
    }

    public void tulostaOmistajat() {
        ArrayList<String> omistajat = new ArrayList<>();
        for(Rekisterinumero rekkari:this.omistaja.keySet()){
            if(!omistajat.contains(this.omistaja.get(rekkari))){
                System.out.println(this.omistaja.get(rekkari));
                omistajat.add(this.omistaja.get(rekkari));
            }
        }
    }

}
