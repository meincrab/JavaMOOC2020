
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true){
            String userInput = lukija.nextLine();
            if(userInput.equals("loppu")){
                break;
            }
            else{
                int luku = Integer.parseInt(userInput);
                System.out.println(luku*luku*luku);
            }
        }
    }
}
