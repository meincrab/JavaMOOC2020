/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Opiskelija extends Henkilo {
    private int opintopisteita;
    
    public Opiskelija(String nimi, String osoite){
        super(nimi, osoite);
        this.opintopisteita = 0;
    }
    public void opiskele(){
        opintopisteita +=1;
    }
    public int opintopisteita(){
        return opintopisteita;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  " + "opintopisteitä " + opintopisteita;
    }
    
}
