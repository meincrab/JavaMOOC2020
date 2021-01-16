
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
         int firstValue = 0;
         int secondValue = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + firstValue + "/100");
            System.out.println("Toinen: " + secondValue + "/100");
            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");
            
            
            if (osat[0].equals("lopeta")) {
                break;
            }
            else if(osat[0].equals("lisaa")){
                int amount =  Integer.parseInt(osat[1]);
                amount = (amount <= 0) ? 0 : amount;
                int result = firstValue += amount;
                firstValue = (result >= 100) ? 100 : result;
            }
            else if(osat[0].equals("siirra")){
                int amount =  Integer.parseInt(osat[1]);
                amount = (amount <= 0) ? 0 : amount;
                if(firstValue - amount < 0){
                    amount = firstValue;
                    firstValue = 0;
                    secondValue += amount;
                }
                else{
                    firstValue -= amount;
                    secondValue += amount;
                    if(secondValue >= 100){
                        secondValue = 100;
                    }
                }
            }
            else if(osat[0].equals("poista")){
               int amount =  Integer.parseInt(osat[1]);
               amount = (amount <= 0) ? 0 : amount;
               secondValue -= amount;
               if(secondValue < 0){
                   secondValue = 0;
               }
               else if(secondValue >= 100){
                        secondValue = 100;
                    }
            }
        }
    }
    

}
