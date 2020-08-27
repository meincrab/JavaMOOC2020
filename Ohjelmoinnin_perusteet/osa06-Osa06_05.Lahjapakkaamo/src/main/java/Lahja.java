/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Lahja {
    private String nimi;
    private int weight;
    public Lahja(String nimi, int weight){
        this.nimi = nimi;
        this.weight = weight;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    public int getPaino(){
        return this.weight;
    }
    public String toString(){
        return this.nimi + " (" + this.weight + "kg)";
    }
    
}
