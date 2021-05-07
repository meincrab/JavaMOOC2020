/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Kirja {
    private String nimi;
    private int kohdeIka;
    
    public Kirja(String nimi, int kohdeIka){
        this.nimi = nimi;
        this.kohdeIka = kohdeIka;
    }
    
    
    public String getNimi(){
        return this.nimi;
    }
    public int getKohdeIka(){
        return this.kohdeIka;
    }
    
    @Override
    public String toString(){
        return this.nimi + " (" + this.kohdeIka + "  vuotiaille ja vanhemmille)";
    }    
}