
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> kayttajanSyotteet = new ArrayList<>();
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.isEmpty()) {
                kayttajanSyotteet.stream()
                        .forEach(sana -> System.out.println(sana));
                
                break;
            }
            
            kayttajanSyotteet.add(syote);
        }
        
    }
}
