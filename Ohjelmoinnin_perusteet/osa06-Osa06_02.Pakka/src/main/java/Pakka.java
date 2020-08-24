import java.util.ArrayList;

/**
 *
 * @author meincrab
 */
import java.util.ArrayList;

public class Pakka {
    
    private ArrayList<String> pakka = new ArrayList<String>();
    
    public boolean onTyhja() {
        return this.pakka.isEmpty();
    }

    public void lisaa(String arvo) {
        this.pakka.add(arvo);
    }

    public ArrayList<String> arvot() {
        return this.pakka;
    }
    
    public String ota(){
        String partTime = pakka.get(this.pakka.size() - 1);
        this.pakka.remove(this.pakka.size() - 1);
        return partTime;
    }
}
