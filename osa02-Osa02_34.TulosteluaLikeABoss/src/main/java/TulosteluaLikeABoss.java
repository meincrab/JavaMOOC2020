
public class TulosteluaLikeABoss {
    //I had to create another print the star method, because testing system 
    //forced me to have println in TulostaTahtia method
    public static void tulostaTahtia(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTahtia2(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }
    }

    public static void tulostaTyhjaa(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        int kokoMod = koko;
        for (int i = 1; i <= kokoMod; i++) {
            tulostaTyhjaa(kokoMod - i);
            tulostaTahtia2(i);
            System.out.println("");
        }
    }

    public static void jouluKuusi(int korkeus) {
        int kokoMod = korkeus;
        for (int i = 1; i <= kokoMod; i++) {
            tulostaTyhjaa(kokoMod - i);
            tulostaTahtia2(i);
            tulostaTahtia2(i - 1);
            System.out.println("");
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia2(3);
        System.out.println("");
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia2(3);
        System.out.println("");
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        /*tulostaKolmio(15);
        System.out.println("---"); */
        jouluKuusi(8);
        System.out.println("---");
        //jouluKuusi(10);
    }
}
