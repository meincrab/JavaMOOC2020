
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true){
            String kommento = lukija.nextLine();
            if(kommento.equalsIgnoreCase("loppu")){
                break;
            }
            else{
                Integer numero = Integer.parseInt(kommento);
                numero = numero * numero * numero;
                System.out.println(numero);
            }
        }
    }
}
