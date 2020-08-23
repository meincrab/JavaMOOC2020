
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {
        if (this.euroa * 100 + this.senttia < verrattava.euroa * 100 + verrattava.senttia) {
            return true;
        }
        return false;
    }

    public Raha miinus(Raha vahentaja) {
        int sentit = (this.euroa * 100 + this.senttia);
        sentit -= (vahentaja.euroa * 100 + vahentaja.senttia);
        if( sentit < 0){
            Raha uusi = new Raha(0, 0);
            return uusi;
        }
        int partEuro = 0;
        if (sentit > 99) {
            partEuro = partEuro + sentit / 100;
            sentit = sentit % 100;
        }
        
        Raha uusi = new Raha(partEuro, sentit);
        return uusi;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
