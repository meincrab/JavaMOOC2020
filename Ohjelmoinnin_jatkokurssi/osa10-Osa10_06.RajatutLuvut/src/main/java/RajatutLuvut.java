
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> kayttajanSyotteet = new ArrayList<>();

        while (true) {
            int kayttajanSyote = Integer.valueOf(lukija.nextLine());

            if (kayttajanSyote < 0) {
                kayttajanSyotteet.stream()
                        .filter(i -> i <= 5)
                        .forEach(i -> System.out.println(i + ""));

                break;
            }
            
            kayttajanSyotteet.add(kayttajanSyote);
        }
    }
}
