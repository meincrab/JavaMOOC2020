
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.println("Syötä luku");
            userInput = Integer.valueOf(lukija.nextLine());
            if (userInput == 0) {
                break;
            } else if (userInput > 0) {
                System.out.println(userInput * userInput);
            } else {
                System.out.println("Epäkelpo luku");
            }
        }
    }
}
