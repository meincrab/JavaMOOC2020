
import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    
    private HashMap<String, ArrayList<String>> kellariHashMap;
    
    public Kellari(){
        this.kellariHashMap = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        this.kellariHashMap.putIfAbsent(komero, new ArrayList<>());
        this.kellariHashMap.get(komero).add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        ArrayList<String> tyhjaLista = new ArrayList<>();
        return this.kellariHashMap.getOrDefault(komero, tyhjaLista);
    }
    public void poista(String komero, String tavara){
        this.kellariHashMap.get(komero).remove(tavara);
        if(this.kellariHashMap.get(komero).isEmpty()){
            this.kellariHashMap.remove(komero);
        }
    }
    public ArrayList<String> komerot(){
        ArrayList<String> komeroAvaimet = new ArrayList<>();
        for(String komero : kellariHashMap.keySet()){
            if(!kellariHashMap.get(komero).isEmpty()){
                komeroAvaimet.add(komero);
            }
        }
        return komeroAvaimet;
    }
}
