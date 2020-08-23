
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String input = lukija.nextLine();
            if (!input.equals("")) {
                String[] palat = input.split(" ");
                for (int i = 0; i < palat.length; i++) {
                    System.out.println(palat[i]);
                }
            }
            else {
                break;
            }
        }
    }
}
