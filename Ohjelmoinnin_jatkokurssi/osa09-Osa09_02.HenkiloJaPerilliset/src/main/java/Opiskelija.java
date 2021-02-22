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
    
    public Opiskelija(){
    this.opintopisteita = 0;
    }
    public void opiskele(){
        opintopisteita +=1;
        System.out.println("opintopisteitä" + opintopisteita);
    }
}
