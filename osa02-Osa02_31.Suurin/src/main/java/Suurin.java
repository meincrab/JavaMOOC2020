
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        int biggest = luku1;
        if(biggest < luku2){
            biggest = luku2;
        }
        if(biggest < luku3){
            biggest = luku3;
        }
        return biggest;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
