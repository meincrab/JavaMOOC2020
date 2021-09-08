
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        int[] luvut = {3, -1, 8, 4};

        System.out.println(summa(luvut, 0, 0, 0, 0));
        System.out.println(summa(luvut, 0, 0, 0, 10));
        System.out.println(summa(luvut, 0, 1, 0, 10));
        System.out.println(summa(luvut, 0, 1, -10, 10));
        System.out.println(summa(luvut, -1, 999, -10, 10));
    }

    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        int summa = 0;
        int aloitusIndeksi = mista;
        int loppuIndeksi = mihin;
        if (mista < 0) {
            aloitusIndeksi = 0;
        }
        if (mihin > taulukko.length) {
            loppuIndeksi = taulukko.length;
        }

        while (aloitusIndeksi < loppuIndeksi) {
            if (taulukko[aloitusIndeksi] <= suurin && taulukko[aloitusIndeksi] >= pienin) {
                summa += taulukko[aloitusIndeksi];
            }
            aloitusIndeksi++;
        }
        return summa;
    }
}
