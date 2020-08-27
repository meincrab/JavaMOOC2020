
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

    public String pisin() {
        int longest = 0;
        String nimi = "";
        if (alkiot.size() == 0) {
            return null;
        } else {
            for (String alkio : alkiot) {
                if (alkio.length() > longest) {
                    longest = alkio.length();
                    nimi = alkio.toString();
                }
            }
        }
        return nimi;
    }

}
