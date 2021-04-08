/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
import java.util.List;
import java.util.ArrayList;

public class Lauma implements Siirrettava {

    private List<Siirrettava> elioLista;
    
    public Lauma(){
        this.elioLista = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        elioLista.add(siirrettava);
    }
    @Override
    public void siirra(int dx, int dy){
        for(Siirrettava siirrettavaObjekti : elioLista){
            siirrettavaObjekti.siirra(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String palautettava = "";
        
        for(Siirrettava siirrettavaObjekti : elioLista){
            palautettava += siirrettavaObjekti.toString().trim() + "\n";
        }
        
        return palautettava;
    }
    

}
