
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
public class HukkaavaLaatikko extends Laatikko {

    private ArrayList<Tavara> hukkaavaTavaralista;

    public HukkaavaLaatikko() {
        this.hukkaavaTavaralista = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        hukkaavaTavaralista.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
}
