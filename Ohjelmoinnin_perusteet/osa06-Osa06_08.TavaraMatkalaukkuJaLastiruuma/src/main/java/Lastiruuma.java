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

public class Lastiruuma {

    private int maxPaino;
    private ArrayList<Matkalaukku> lastiruuma = new ArrayList<Matkalaukku>();

    public Lastiruuma(int maxPaino) {
        this.maxPaino = maxPaino;
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        int laukut = 0;
        for (Matkalaukku yksLaukku : lastiruuma) {
            laukut += yksLaukku.yhteispaino();
        }
        if (laukut + laukku.yhteispaino() <= maxPaino) {
            lastiruuma.add(laukku);
        }
    }

    @Override
    public String toString() {
        int yhteisPaino = 0;
        for (Matkalaukku yksLaukku : lastiruuma) {
            yhteisPaino += yksLaukku.yhteispaino();
        }
        return lastiruuma.size() + " matkalaukkua (" + yhteisPaino +  " kg)";
    }
    
    public void tulostaTavarat(){
        for(Matkalaukku matkalaukku : lastiruuma){
            matkalaukku.tulostaTavarat();
        }
    }
}
