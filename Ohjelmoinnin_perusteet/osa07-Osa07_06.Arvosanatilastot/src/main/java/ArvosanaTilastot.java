
import java.util.ArrayList;

public class ArvosanaTilastot {

    private ArrayList<Integer> points;

    public ArvosanaTilastot() {
        this.points = new ArrayList<>();
    }

    public void lisaa(int point) {
        this.points.add(point);
    }

    public double keskiArvo() {
        double summa = 0;
        for (Integer point : points) {
            summa += point;
        }
        return summa / this.points.size();
    }

    public double lapiKeskiArvo() {
        double lapSumma = 0;
        int amountOfLap = 0;
        for (Integer point : points) {
            if (point >= 50) {
                lapSumma += point;
                amountOfLap++;
            }
        }
        return lapSumma / amountOfLap;
    }
}
