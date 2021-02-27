/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        int kokoPaino = 0;
        for(Tavara tavar: tavarat){
            kokoPaino += tavar.getPaino();
        }
        if(kokoPaino + tavara.getPaino() <= maksimipaino){
            this.tavarat.add(tavara);
        }
        
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.tavarat.contains(tavara);
    }
    
    
    
    
}
