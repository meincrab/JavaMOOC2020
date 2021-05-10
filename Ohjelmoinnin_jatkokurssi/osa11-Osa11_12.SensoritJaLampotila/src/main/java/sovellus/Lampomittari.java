/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.Random;

/**
 *
 * @author meincrab
 */
public class Lampomittari implements Sensori {

    private int arvo;
    private boolean tilanne;

    public Lampomittari() {
        this.tilanne = false;
    }

    @Override
    public boolean onPaalla() {
        return tilanne;
    }

    @Override
    public void paalle() {
        this.tilanne = true;
    }

    @Override
    public void poisPaalta() {
        this.tilanne = false;
    }
    
    @Override
    public int mittaa(){
        if(!this.onPaalla()){
            throw new IllegalStateException("Ei ole paalla");
        }
        Random satunnainen = new Random();
        arvo = satunnainen.nextInt(61);
        arvo -= 30;
        return arvo;
    }
}
