/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Mittari {
    private int mitta;
    
    
    public void lisaa(){
        if(this.mitta + 1 <= 5){
            this.mitta +=1;
        }
    }
    public void vahenna(){
         if(this.mitta - 1 > 1){
            this.mitta -= 1;
        }
    }
    public int mitta(){
        return this.mitta;
    }
    
    public boolean taynna(){
        if(this.mitta == 5){
            return true;
        }
        else {
            return false;
        }
    }
    
}
