
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

        Kasi kasi1 = new Kasi();

        kasi1.lisaa(new Kortti(2, Maa.RUUTU));
        kasi1.lisaa(new Kortti(14, Maa.PATA));
        kasi1.lisaa(new Kortti(12, Maa.HERTTA));
        kasi1.lisaa(new Kortti(2, Maa.PATA));

        Kasi kasi2 = new Kasi();

        kasi2.lisaa(new Kortti(11, Maa.RUUTU));
        kasi2.lisaa(new Kortti(11, Maa.PATA));
        kasi2.lisaa(new Kortti(11, Maa.HERTTA));

        int vertailu = kasi1.compareTo(kasi2);

        if (vertailu < 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi2.tulosta();
        } else if (vertailu > 0) {
            System.out.println("arvokkaampi käsi sisältää kortit");
            kasi1.tulosta();
        } else {
            System.out.println("kädet yhtä arvokkaat");
        }

        /* Kortti eka = new Kortti(2, Maa.RUUTU);
        Kortti toka = new Kortti(14, Maa.PATA);
        Kortti kolmas = new Kortti(12, Maa.HERTTA);

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(kolmas); */
    }
}
