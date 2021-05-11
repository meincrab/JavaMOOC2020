/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author meincrab
 */
import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {

    private List<Sensori> kokoelmaSensoreita;
    private final List<Integer> arvot;

    public Keskiarvosensori() {
        this.kokoelmaSensoreita = new ArrayList<>();
        this.arvot = new ArrayList<>();
    }
    
    public void lisaaSensori(Sensori lisattava) {
        kokoelmaSensoreita.add(lisattava);
    }

    private boolean tilanneCheck() {
        return (kokoelmaSensoreita.stream().allMatch(x -> x.onPaalla()) && !kokoelmaSensoreita.isEmpty());
    }

    @Override
    public boolean onPaalla() {
        return tilanneCheck();
    }

    @Override
    public void paalle() {
        kokoelmaSensoreita.stream().forEach(x -> x.paalle());
    }

    @Override
    public void poisPaalta() {
        kokoelmaSensoreita.stream().forEach(x -> x.poisPaalta());
    }
    @Override
    public int mittaa(){
        if(!this.onPaalla() || kokoelmaSensoreita.isEmpty()){
            throw new IllegalStateException("Sensorit eivät ole päällä");
        }
        int arvo = (int)kokoelmaSensoreita.stream().mapToInt(x -> x.mittaa()).average().getAsDouble();
        arvot.add(arvo);
        /*
        kokoelmaSensoreita.stream().forEach(x -> arvot.add(x.mittaa()));
        int sum = arvot.stream().mapToInt(Integer::intValue).sum();
        int palautettavaArvo = sum / arvot.size();*/
        return arvo;
    }
    
    public List<Integer> mittaukset(){
        return arvot;
    }

}
