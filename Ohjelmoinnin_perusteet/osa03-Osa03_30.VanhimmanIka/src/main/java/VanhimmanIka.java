
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin = 0;
        while (true) {
            String input = lukija.nextLine();
            if (!input.equals("")) {
                String[] palat = input.split(",");
                int age = Integer.valueOf(palat[1]);
                vanhin = (age > vanhin) ? vanhin = age : vanhin;
            } else {
                System.out.println("Vanhimman ikä: " + vanhin);
                break;
            }
        }

    }
}
