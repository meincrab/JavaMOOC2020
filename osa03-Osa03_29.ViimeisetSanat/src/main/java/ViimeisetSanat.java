
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String input = lukija.nextLine();
            if (!input.equals("")) {
                String[] palat = input.split(" ");
                System.out.println(palat[palat.length - 1]);
            } else {
                break;
            }
        }

    }
}
