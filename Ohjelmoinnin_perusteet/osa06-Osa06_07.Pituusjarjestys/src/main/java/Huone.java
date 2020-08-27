
import java.util.ArrayList;

public class Huone {

    private ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }

    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }

    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }

    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        int lyhin = 99999999;
        for (Henkilo henkilo : henkilot) {
            if (henkilo.getPituus() < lyhin) {
                lyhin = henkilo.getPituus();
            }
        }
        for (Henkilo henkilo : henkilot) {
            if (henkilo.getPituus() == lyhin) {
                return henkilo;
            }
        }
        return null;
    }

    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        Henkilo random = lyhin();
        this.henkilot.remove(random);
        return random;
       
    }
}
