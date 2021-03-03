/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
public class Asevelvollinen implements Palvelusvelvollinen {

    private int paivat;

    public Asevelvollinen(int paivat) {
        this.paivat = paivat;
    }

    @Override
    public int paiviaJaljella() {
        return this.paivat;
    }

    @Override
    public void palvele() {
        if ((this.paivat - 1) < 0) {
            this.paivat = 0;
        }
        else {
            this.paivat -= 1;
        }
    }

}
