
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        int lahja = Integer.valueOf(lukija.nextLine());
        double vero;
        if (lahja < 5000) {
            System.out.println("Ei veroa!");
        } else if (lahja < 25000) {
            vero = 100 + (lahja - 5000) * 0.08;
            System.out.println("Vero: " + vero);
        } else if (lahja < 55000) {
            vero = 1700 + (lahja - 25000) * 0.1;
            System.out.println("Vero: " + vero);
        } else if (lahja < 200000) {
            vero = 4700 + (lahja - 55000) * 0.12;
            System.out.println("Vero: " + vero);
        } else if (lahja < 1000000) {
            vero = 22100 + (lahja - 200000) * 0.15;
            System.out.println("Vero: " + vero);
        } else {
            vero = 142100 + (lahja - 1000000) * 0.17;
            System.out.println("Vero: " + vero);
        }

    }
}
