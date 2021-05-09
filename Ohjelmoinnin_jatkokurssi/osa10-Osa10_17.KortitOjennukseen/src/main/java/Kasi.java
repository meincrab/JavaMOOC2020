import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
public class Kasi implements Comparable<Kasi>{
    private List<Kortti> korttiKadessa;
    
    public Kasi(){
        this.korttiKadessa = new ArrayList();
    }
    
    
    public void lisaa(Kortti kortti){
        this.korttiKadessa.add(kortti);
    }
    public void tulosta(){
        korttiKadessa
                .stream()
                .forEach(System.out::println);
    }
    
    public void jarjesta(){
        Collections.sort(korttiKadessa);
    }
    
    public int getKadenArvo(){
        return korttiKadessa
                .stream()
                .mapToInt(Kortti::getArvo)
                .sum();
    }
    public void jarjestaMaittain(){
        SamatMaatVierekkainArvojarjestykseen jarjesta = new SamatMaatVierekkainArvojarjestykseen();
        Collections.sort(korttiKadessa, jarjesta);
    }
    @Override
    public int compareTo(Kasi toinenKasi){
        return this.getKadenArvo() - toinenKasi.getKadenArvo();
    }
}