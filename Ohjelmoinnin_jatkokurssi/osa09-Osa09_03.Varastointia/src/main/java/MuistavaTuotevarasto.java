/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria hintaTiedot;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo){
        super(tuotenimi, tilavuus);
        this.hintaTiedot = new Muutoshistoria();
        asetaAlkusaldo(alkuSaldo);
        
    }
    
    
    public String historia(){
        return hintaTiedot.toString();
    }
    
    private void asetaAlkusaldo(double alkuSaldo){
        hintaTiedot.lisaa(alkuSaldo);
        super.lisaaVarastoon(alkuSaldo);
    }
    
    @Override
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        hintaTiedot.lisaa(super.getSaldo());
    }
    @Override
    public double otaVarastosta(double maara){
        double otettuMaara = super.otaVarastosta(maara);
        hintaTiedot.lisaa(super.getSaldo());
        return otettuMaara;
    }
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " + super.getNimi() + "\n" +
                "Historia: " + hintaTiedot + "\n" +
                "Suurin tuotemäärä: " + hintaTiedot.maxArvo() + "\n" +
                "Pienin tuotemäärä:" + hintaTiedot.minArvo() + "\n" + 
                "Keskiarvo:" + hintaTiedot.keskiarvo()
                );
    }
    @Override
    public String toString(){
        return hintaTiedot.toString();
    }
}
