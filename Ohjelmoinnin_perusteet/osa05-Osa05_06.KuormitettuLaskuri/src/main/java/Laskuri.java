/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Laskuri {

    int alkuarvo;

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }

    public Laskuri() {
        this.alkuarvo = 0;
    }

    public int arvo() {
        return this.alkuarvo;
    }

    public void lisaa() {
        this.alkuarvo += 1;
    }

    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.alkuarvo += lisays;
        }
    }

    public void vahenna() {
        this.alkuarvo -= 1;
    }

    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            this.alkuarvo -= vahennys;
        }
    }

}
