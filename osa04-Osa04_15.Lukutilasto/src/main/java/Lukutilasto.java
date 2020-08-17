
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;
    
    public Lukutilasto() {
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara += 1;
        this.summa += luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }

    public int summa() {
        return this.summa;
    }

    public double keskiarvo() {
        if(lukujenMaara == 0){
            return 0;
        }
        return (1.0 * this.summa / this.lukujenMaara);
    }
}
