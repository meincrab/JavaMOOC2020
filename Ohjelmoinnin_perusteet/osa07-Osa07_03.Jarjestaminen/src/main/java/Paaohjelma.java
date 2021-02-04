import java.util.Arrays;
 
public class Paaohjelma {
 
    public static void main(String[] args) {
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }
 
    public static int pienin(int[] taulukko) {
        int smallest = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            smallest = (smallest >= taulukko[i]) ? taulukko[i] : smallest;
        }
        return smallest;
    }
 
    public static int pienimmanIndeksi(int[] taulukko) {
        int smallest = pienin(taulukko);
        int smallestIndex = 0;
        for (int i = 0; i < taulukko.length; i++) {
            smallestIndex = (taulukko[i] == smallest) ? i : smallestIndex;
        }
        return smallestIndex;
    }
 
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int smallest = taulukko[aloitusIndeksi];
        int smallestIndex = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            smallest = (smallest >= taulukko[i]) ? taulukko[i] : smallest;
        }
        for (int i = smallestIndex; i < taulukko.length; i++) {
            smallestIndex = (taulukko[i] == smallest) ? i : smallestIndex;
        }
        return smallestIndex;
    }
 
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int storage = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = storage;
    }
 
    public static void jarjesta(int[] taulukko) {
        System.out.println(Arrays.toString(taulukko));
        for (int i = 0; i < taulukko.length; i++) {
            int smallestAtm = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, smallestAtm);
            System.out.println(Arrays.toString(taulukko));
        }
 
    }
 
}