
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> syöte = new ArrayList<>();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true) {
            String rivi = lukija.nextLine();
            
            if(rivi.equals("loppu")) {
                double keskiarvo = syöte.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
                
                System.out.println("Lukujen keskiarvo: " + keskiarvo);
                break;
            }
            
            syöte.add(rivi);
        }
    }
}
