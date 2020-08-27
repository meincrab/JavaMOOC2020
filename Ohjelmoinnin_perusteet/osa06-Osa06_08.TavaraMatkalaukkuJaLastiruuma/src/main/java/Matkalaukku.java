/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
import java.util.ArrayList;

public class Matkalaukku {

    private int maxPaino;
    private ArrayList<Tavara> tavarat = new ArrayList<Tavara>();

    public Matkalaukku(int maxPaino) {
        this.maxPaino = maxPaino;
    }

    public void lisaaTavara(Tavara tavara) {
        int totalWeight = 0;
        for (Tavara laukussa : tavarat) {
            totalWeight += laukussa.getPaino();
        }
        if (!(totalWeight + tavara.getPaino() > maxPaino)) {
            tavarat.add(tavara);
        }

    }

    public String toString() {
        int totalWeight = 0;
        for (Tavara laukussa : tavarat) {
            totalWeight += laukussa.getPaino();
        }
        if(tavarat.isEmpty()){
             return "0 tavaraa (0 kg)";
        }
        if(tavarat.size() == 1){
            return tavarat.size() + " tavara (" + totalWeight + ")";
        }
        else{
            return tavarat.size() + " tavaraa (" + totalWeight + ")";
        }
    }
}
