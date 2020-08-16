
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin = 0;
        String name = "";
        while (true) {
            String input = lukija.nextLine();
            if (!input.equals("")) {
                String[] palat = input.split(",");
                int age = Integer.valueOf(palat[1]);
                if(age > vanhin){
                    vanhin = age;
                    name = palat[0];
                }
            } else {
                System.out.println("Vanhimman nimi: " + name);
                break;
            }
        }

    }
}
