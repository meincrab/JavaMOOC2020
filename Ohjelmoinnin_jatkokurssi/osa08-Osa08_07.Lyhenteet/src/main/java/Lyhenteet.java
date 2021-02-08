
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
public class Lyhenteet {
    
    private HashMap<String, String> lyhenteet;

    public Lyhenteet(){
        this.lyhenteet = new HashMap<>();
    }

    public void lisaaLyhenne(String lyhenne, String selite) {
        lyhenteet.put(lyhenne, selite);
    }

    public boolean onkoLyhennetta(String lyhenne) {
        if(this.lyhenteet.get(lyhenne) != null){
            return true;
        }
        else{
            return false;
        }
        
    }

    public String haeLyhenne(String lyhenne) {
        return this.lyhenteet.get(lyhenne);
    }
}
