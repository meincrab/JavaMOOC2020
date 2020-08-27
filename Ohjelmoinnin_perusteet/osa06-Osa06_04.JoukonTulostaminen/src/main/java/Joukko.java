
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {
        if (this.alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        }
        String tulostus = "";
        String amount = "";
        if (this.alkiot.size() == 1) {
            amount = "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkio:\n";
            for (String alkio : alkiot) {
                tulostus = tulostus + alkio;
            }
        } else {
            amount = "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkiota:\n";
            for (String alkio : alkiot) {
                tulostus = tulostus + alkio + "\n";
            }
        }

        return amount + tulostus;
    }

}
