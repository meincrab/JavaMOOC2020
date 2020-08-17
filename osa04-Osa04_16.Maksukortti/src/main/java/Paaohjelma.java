
public class Paaohjelma {

    public static void main(String[] args) {
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        System.out.println("Pekka "+ pekanKortti.toString());
        System.out.println("Matti "+ matinKortti.toString());
        pekanKortti.lataaRahaa(20.0);
        matinKortti.syoMaukkaasti();
        System.out.println("Pekka "+ pekanKortti.toString());
        System.out.println("Matti "+ matinKortti.toString());
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        System.out.println("Pekka "+ pekanKortti.toString());
        System.out.println("Matti "+ matinKortti.toString());
        
    }
}
