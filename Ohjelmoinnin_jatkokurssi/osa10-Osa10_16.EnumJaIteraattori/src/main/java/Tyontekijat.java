/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meincrab
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Tyontekijat {

    private List<Henkilo> henkilot;

    public Tyontekijat() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        this.henkilot.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat
                .stream()
                .forEach(lisattava -> this.lisaa(lisattava));
    }

    public void tulosta() {
        Iterator<Henkilo> it = henkilot.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> it = henkilot.iterator();
        while (it.hasNext()) {
            Henkilo henkilo = it.next();
            if (henkilo.getKoulutus().equals(koulutus)) {
                System.out.println(henkilo);
            }
        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> it = henkilot.iterator();
        while(it.hasNext()){
            if(it.next().getKoulutus().equals(koulutus)){
                it.remove();
            }
        }
    }
}
