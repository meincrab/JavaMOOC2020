/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */

import java.util.ArrayList;

public class Tehtavalista {
    
    private ArrayList<String> lista = new ArrayList<>();
    
    public void lisaa(String tehtava){
        lista.add(tehtava);
    }
    
    public void tulosta(){
        int numbering = 0;
        for(String tehtava : lista){
            numbering += 1;
            System.out.println(numbering + ": " + tehtava);
        }
    }
    public void poista(int numero){
        lista.remove(numero - 1);
    }
}
