
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int biggest = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }
            if(biggest < luettu ){
                biggest = luettu;
            }

            lista.add(luettu);
        }
        
        System.out.println("Listan suurin luku: " + biggest);

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
