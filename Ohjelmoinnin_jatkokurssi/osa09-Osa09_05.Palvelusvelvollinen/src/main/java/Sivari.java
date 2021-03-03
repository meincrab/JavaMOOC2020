
public class Sivari implements Palvelusvelvollinen {

    private int paivat;

    public Sivari() {
        this.paivat = 362;
    }

    @Override
    public int paiviaJaljella() {
        System.out.println(this.paivat);
        return this.paivat;
    }

    @Override
    public void palvele() {
        if ((this.paivat - 1) < 0) {
            this.paivat = 0;
        } else {
            this.paivat -= 1;
        }
    }
}
