
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tehtavalista lista = new Tehtavalista();
        Kayttoliittyma uusiKayttoliittyma = new Kayttoliittyma(lista, lukija);
        uusiKayttoliittyma.kaynnista();
    }
}
