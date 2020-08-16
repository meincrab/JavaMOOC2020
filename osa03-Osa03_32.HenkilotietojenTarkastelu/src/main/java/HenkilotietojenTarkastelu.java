
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin = 0;
        String pisinNimi = "";
        int ageSum = 0;
        int amount = 0;
        while (true) {
            String input = lukija.nextLine();
            if (!input.equals("")) {
                String[] palat = input.split(",");
                int age = Integer.valueOf(palat[1]);
                ageSum += age;
                amount += 1;
                if(palat[0].length() > pisinNimi.length()){
                    pisinNimi = palat[0];
                }
            } else {
                break;
            }
        }
        
        double average = 1.0 * ageSum / amount;
        System.out.println("Pisin nimi: " + pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: " + average);

    }
}
