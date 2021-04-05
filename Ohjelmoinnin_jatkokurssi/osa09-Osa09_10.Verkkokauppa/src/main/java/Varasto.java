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
    private Map<String, Integer> varastoSaldot;

    public Varasto() {
        this.hinnat = new HashMap<>();
        this.varastoSaldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        hinnat.put(tuote, hinta);
        varastoSaldot.put(tuote, saldo);
    }

    public int hinta(String tuote) {
        return hinnat.getOrDefault(tuote, -99);
    }

    public int saldo(String tuote) {
        if (this.varastoSaldot.containsKey(tuote)) {
            return this.varastoSaldot.get(tuote);
        }
        return 0;
    }

    public boolean ota(String tuote) {
        if (this.varastoSaldot.containsKey(tuote)) {
            if (this.varastoSaldot.get(tuote) > 0) {
                int olemassa = this.varastoSaldot.get(tuote) - 1;
                this.varastoSaldot.put(tuote, olemassa);
                return true;
            }
        }
        return false;
    }

    public Set<String> tuotteet() {
        return this.hinnat.keySet();
    }
}
