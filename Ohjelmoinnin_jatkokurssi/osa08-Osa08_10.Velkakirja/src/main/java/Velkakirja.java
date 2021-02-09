
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
public class Velkakirja {

    private HashMap<String, Double> velkaKirja;

    public Velkakirja() {
        this.velkaKirja = new HashMap<>();
    }

    public void asetaLaina(String kenelle, double maara){
        this.velkaKirja.put(kenelle, maara);
    }
    public double paljonkoVelkaa(String kuka){
        return this.velkaKirja.getOrDefault(kuka, 0.0);
    }
}
