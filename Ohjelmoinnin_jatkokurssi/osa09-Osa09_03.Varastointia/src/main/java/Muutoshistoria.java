
import java.util.ArrayList;
import java.util.Collections;

public class Muutoshistoria {
    
    private ArrayList<Double> hintaTiedot;
    
    public Muutoshistoria() {
        this.hintaTiedot = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        this.hintaTiedot.add(tilanne);
    }
    
    public void nollaa() {
        this.hintaTiedot.clear();
    }
    
    public double maxArvo() {
        return Collections.max(hintaTiedot);
    }
    
    public double minArvo() {
        return Collections.min(hintaTiedot);
    }

    public double keskiarvo() {
        return hintaTiedot.stream().mapToDouble(a -> a).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return hintaTiedot.toString();
    }
}
