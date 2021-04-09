
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<Integer> positiiviset(List<Integer> luvut){
        ArrayList<Integer> haePositiiviset = luvut.stream()
                .filter(i -> i >  0)
                .collect(Collectors.toCollection(ArrayList::new));
        
                return haePositiiviset;
    }

}
