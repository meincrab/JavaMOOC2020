
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> syote = new ArrayList<>();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");

        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
                String kaytSyote = lukija.nextLine();

                if (kaytSyote.isEmpty()) {
                    continue;
                }

                if (kaytSyote.toLowerCase().equals("n")) {
                    double negatKeskiarvo = syote.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Negatiivisten lukujen keskiarvo: " + negatKeskiarvo);
                } else if (kaytSyote.toLowerCase().equals("p")) {
                    double positKeskiarvo = syote.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i >= 0)
                            .average()
                            .getAsDouble();
                    System.out.println("Positiivisten lukujen keskiarvo: " + positKeskiarvo);
                }
                break;
            }
            syote.add(rivi);
        }
    }
}
