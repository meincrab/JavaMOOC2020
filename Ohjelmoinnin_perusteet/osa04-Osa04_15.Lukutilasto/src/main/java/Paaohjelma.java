
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parTilasto = new Lukutilasto();
        Lukutilasto tonTilasto = new Lukutilasto();
        System.out.println("Anna lukuja:");
        int userInput = Integer.valueOf(lukija.nextLine());
        while(userInput != -1){
            tilasto.lisaaLuku(userInput);
            if(userInput % 2 == 0){
                parTilasto.lisaaLuku(userInput);
            }else{
                tonTilasto.lisaaLuku(userInput);
            }
            userInput = Integer.valueOf(lukija.nextLine());
        }
        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
        System.out.println("Parillisten summa: " + parTilasto.summa());
        System.out.println("Parittomien summa: " + tonTilasto.summa());
    }
}
