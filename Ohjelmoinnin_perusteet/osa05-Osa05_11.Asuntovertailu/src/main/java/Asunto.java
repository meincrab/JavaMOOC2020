
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;
    private int hintaero;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        else {
            return false;
        }
    }
    public int hintaero(Asunto verrattava){
        hintaero = this.neliohinta * this.nelioita - verrattava.neliohinta*verrattava.nelioita;
        if(hintaero > 0){
            return hintaero;
        }
        else {
            return hintaero * -1;
        }
    }
    public boolean kalliimpi(Asunto verrattava) {
        if((this.neliohinta * this.nelioita) > (verrattava.neliohinta * verrattava.nelioita)){
            return true;
        }
        else {
            return false;
        }
    }
}
