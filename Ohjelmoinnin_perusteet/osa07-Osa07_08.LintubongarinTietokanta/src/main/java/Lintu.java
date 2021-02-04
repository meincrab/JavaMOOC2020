/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int kerrat;
    
    public Lintu(String nimi, String latinaNimi){
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    public String getLatinaNimi(){
        return this.latinaNimi;
    }
    public void increaseKerrat(){
        this.kerrat++;
    }
    
    @Override
    public String toString(){
        return this.nimi + "(" + this.latinaNimi + "): " + this.kerrat + " havaintoa";
    }
    
}
