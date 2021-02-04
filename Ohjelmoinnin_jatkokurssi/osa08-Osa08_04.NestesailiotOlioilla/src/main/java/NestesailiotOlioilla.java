
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio ekaSailio = new Sailio();
        Sailio tokaSailio = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + ekaSailio);
            System.out.println("Toinen: " + tokaSailio);
            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");

            if (osat[0].equals("lopeta")) {
                break;
            } else if (osat[0].equals("lisaa")) {
                int amount = Integer.parseInt(osat[1]);
                ekaSailio.lisaa(amount);
            } else if (osat[0].equals("siirra")) {
                int amount = Integer.parseInt(osat[1]);
                if (amount > ekaSailio.sisalto()) {
                    tokaSailio.lisaa(ekaSailio.sisalto());
                } else {
                    ekaSailio.poista(amount);
                    tokaSailio.lisaa(amount);
                }
            } else if (osat[0].equals("poista")) {
                int amount = Integer.parseInt(osat[1]);
                tokaSailio.poista(amount);
            }
        }
    }

}
