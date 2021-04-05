
import java.util.Set;

public class Paaohjelma {

    public static void main(String[] args) {
        Ostoskori kori = new Ostoskori();
        kori.lisaa("maito", 3);
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta() + "\n");

        kori.lisaa("piima", 2);
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta() + "\n");

        kori.lisaa("maito", 3);
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta() + "\n");

        kori.lisaa("maito", 3);
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta() + "\n");
    }
}
