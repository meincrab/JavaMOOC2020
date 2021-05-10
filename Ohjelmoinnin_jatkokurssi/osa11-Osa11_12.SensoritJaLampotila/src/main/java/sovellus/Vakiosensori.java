/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author meincrab
 */
public class Vakiosensori implements Sensori {

    private int arvo;

    public Vakiosensori(int arvo) {
        this.arvo = arvo;
    }

    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {

    }

    @Override
    public void poisPaalta() {

    }

    @Override
    public int mittaa() {
        return arvo;
    }
}
