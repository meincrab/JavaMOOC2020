
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TiedostonRivit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        
    }

    public static List<String> lue(String tiedosto) {
        List<String> tiedostoVirtana = new ArrayList<>();
        try {
            tiedostoVirtana = Files.lines(Paths.get(tiedosto)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return tiedostoVirtana;
    }
}
