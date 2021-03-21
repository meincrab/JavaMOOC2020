/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Varasto {
    
    private Map<String, Integer> hinnat;
    
    public Varasto(){
        this.hinnat = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        hinnat.put(tuote, hinta);
    }
    public int hinta(String tuote){
        return hinnat.getOrDefault(tuote, -99);
    }
}
