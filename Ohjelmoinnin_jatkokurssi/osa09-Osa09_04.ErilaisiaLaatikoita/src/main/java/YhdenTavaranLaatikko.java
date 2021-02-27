
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meincrab
 */
public class YhdenTavaranLaatikko extends Laatikko {

    private ArrayList<Tavara> yksiTavara;

    public YhdenTavaranLaatikko() {
        this.yksiTavara = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if(this.yksiTavara.size() == 0){
            this.yksiTavara.add(tavara);
        }
    }
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if(this.yksiTavara.size() == 0){
            return false;
        }
        if(this.yksiTavara.get(0).equals(tavara)){
            return true;
        }
        return false;
    }

}
