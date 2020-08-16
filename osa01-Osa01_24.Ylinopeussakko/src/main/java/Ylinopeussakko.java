
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Kerro nopeus:");
        int speed = Integer.valueOf(lukija.nextLine());
        if(speed > 120) {
            System.out.println("Ylinopeussakko!");
        }
    }
}
