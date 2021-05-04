
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        try { 
        Files.lines(Paths.get("lukutaito.csv")).map(x -> x.split(","))
        .sorted((x, y) -> { return Double.valueOf(x[5]) < Double.valueOf(y[5]) ? -1 : 1;})
        .forEach(rivi -> System.out.println(rivi[3] + " (" + rivi[4] + "), " + rivi[2].replaceAll("[^a-zA-Z]", "") + ", " + rivi[5]));
        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}