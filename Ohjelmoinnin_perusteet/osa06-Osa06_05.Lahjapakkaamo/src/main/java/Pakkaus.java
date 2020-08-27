import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lahjat = new ArrayList<>();
    
    public void lisaaLahja(Lahja lahja){
        this.lahjat.add(lahja);
    }
    public int yhteispaino(){
        int weight = 0;
        for(Lahja lahja : lahjat){
            weight += lahja.getPaino();
        }
        return weight;
    }
}
