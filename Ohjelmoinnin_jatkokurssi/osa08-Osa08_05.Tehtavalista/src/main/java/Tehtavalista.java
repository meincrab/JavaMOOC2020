/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
import java.util.ArrayList;

public class Tehtavalista {

    private ArrayList<String> tehtavaLista;

    public Tehtavalista() {
        this.tehtavaLista = new ArrayList<>();
    }

    public void lisaa(String tehtava) {
        this.tehtavaLista.add(tehtava);
    }

    public void tulosta() {
        Integer number = 1;
        for (String tehtava : tehtavaLista) {
            System.out.println(number +  ": " + tehtava);
            number+=1;
        }
    }

    public void poista(int numero) {
        tehtavaLista.remove(numero - 1);
    }
}
