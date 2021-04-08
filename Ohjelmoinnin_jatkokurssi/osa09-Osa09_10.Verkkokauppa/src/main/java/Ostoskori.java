
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (!this.ostokset.containsKey(tuote)) {
            this.ostokset.put(tuote, new Ostos(tuote, 1, hinta));
        } else {
            this.ostokset.get(tuote).kasvataMaaraa();
        }
    }

    public int hinta() {
        int kokonaishinta = 0;
        for (Ostos ostos : this.ostokset.values()) {
            kokonaishinta += ostos.hinta();
        }

        return kokonaishinta;
    }

    public void kasvataMaaraa(String tuote) {
        this.ostokset.get(tuote).kasvataMaaraa();
    }

    public void tulosta() {
        for (String ostos : ostokset.keySet()) {
            System.out.println(ostokset.get(ostos).toString());
        }
    }
}
