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

public class Putki<T> {

    private List<T> kokoelmaElementteja;

    public Putki() {
        this.kokoelmaElementteja = new ArrayList<>();
    }

    public void lisaaPutkeen(T arvo) {
        kokoelmaElementteja.add(arvo);
    }

    public T otaPutkesta() {
        if (onkoPutkessa()) {
            T elementti = kokoelmaElementteja.get(0);
            kokoelmaElementteja.remove(elementti);
            return elementti;
        }
        return null;
    }

    public boolean onkoPutkessa(){
        return !kokoelmaElementteja.isEmpty();
    }
}
