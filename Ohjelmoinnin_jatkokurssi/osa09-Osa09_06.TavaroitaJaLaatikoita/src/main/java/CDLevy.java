/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class CDLevy implements Talletettava{
    private String nimi;
    private String artisti;
    private double paino;
    private int julkaisuvuosi;

    public CDLevy(String nimi, String artisti, int julkaisuvuosi) {
        this.nimi = nimi;
        this.artisti = artisti;
        this.paino = 0.1;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    @Override
    public double paino() {
        return this.paino;
    }

    @Override
    public String toString() {
        return nimi + ": " + artisti +" (" + julkaisuvuosi + ")";
    }

    
    
    
    
    
    
}
