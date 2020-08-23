
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }

    public boolean equals(Object toinenKappale) {
        if (this == toinenKappale) {
            return true;
        }

        if (!(toinenKappale instanceof Kappale)) {
            return false;
        }

        Kappale verrattavaToinenKappale = (Kappale) toinenKappale;

        if (this.esittaja.equals(verrattavaToinenKappale.esittaja)
                && this.nimi.equals(verrattavaToinenKappale.nimi)
                && this.pituusSekunteina == verrattavaToinenKappale.pituusSekunteina) {
            return true;
        }
        else {
            return false;
        }
    }

}
