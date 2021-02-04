
import java.util.Scanner;
import java.util.ArrayList;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {

            int kommento = Integer.parseInt(lukija.nextLine());
            if (kommento == 0) {
                if (luvut.isEmpty()) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                }
                double sum = 0;
                for(Integer luku : luvut){
                    sum += luku;
                }
                sum = sum / luvut.size();
                System.out.println(sum);
                break;
            } else {
                if (kommento >= 1) {
                    luvut.add(kommento);
                }
            }
        }
    }
}
