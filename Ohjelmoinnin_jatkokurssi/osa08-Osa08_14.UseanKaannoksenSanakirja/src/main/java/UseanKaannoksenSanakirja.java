import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {

    private HashMap<String, ArrayList<String>> kaannoksetHashMap;
    
    public UseanKaannoksenSanakirja(){
        this.kaannoksetHashMap = new HashMap<>();
    }
    public void lisaa(String sana, String kaannos) {
        this.kaannoksetHashMap.putIfAbsent(sana, new ArrayList<String>());
        this.kaannoksetHashMap.get(sana).add(kaannos);
    }

    public ArrayList<String> kaanna(String sana) {
        ArrayList<String> tyhjaLista = new ArrayList<>();
        return this.kaannoksetHashMap.getOrDefault(sana, tyhjaLista);
    }

    public void poista(String sana) {
        this.kaannoksetHashMap.remove(sana);
    }
}
