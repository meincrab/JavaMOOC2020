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
    private int pageNum;
    private int releaseYear;
    
    public Kirja(String nimi, int pageNum, int releaseYear){
         this.nimi = nimi;
         this.pageNum = pageNum;
         this.releaseYear = releaseYear;
    }
    public String getName(){
        return(this.nimi);
    }
    public String toString(){
        return this.nimi + ", " + this.pageNum + " sivua, " + this.releaseYear;
    }
}
