/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Harjoitusapuri {
    private int ika;
    private int leposyke;
    
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;
    }
    public double tavoitesyke(double prosenttiaMaksimista){
        double maksSyke = 206.3 - (0.711 * this.ika);
        double tavoite = (maksSyke - this.leposyke) * (prosenttiaMaksimista) + this.leposyke;
        return tavoite;
    }
}
