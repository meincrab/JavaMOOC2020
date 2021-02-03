/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
import java.util.ArrayList;

public class LintuBongari {
    private ArrayList<Lintu> lintuBongari;
    private Lintu lintu;
    
    public LintuBongari(){
        this.lintuBongari = new ArrayList<>();
    }
    
    public void uusLintu(String nimi, String latinaNimi){
        lintu = new Lintu(nimi, latinaNimi);
        this.lintuBongari.add(lintu);          
    }
    public ArrayList<Lintu> getLinnut(){
        return this.lintuBongari;
    }
    
    public void naytaKaikki(){
        for(Lintu lintu : lintuBongari){
            System.out.println(lintu);
        }
    }
}
