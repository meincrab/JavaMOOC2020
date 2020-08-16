
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.");
        System.out.println("Minkä niminen tarinassa esiintyvä hahmo on?");
        String heroName = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String heroProfession = lukija.nextLine();
        System.out.println("Tässä tarina:");
        System.out.println("Olipa kerran " + heroName + ", joka oli ammatiltaan "+ heroProfession + ".");
        System.out.println("Matkatessaan töihin, "+ heroName +" mietti arkeaan.");
        System.out.println("Ehkäpä "+ heroName +" ei olekaan koko elämäänsä "+ heroProfession + ".");
    }
}
