
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class Hajautustaulu {

    private ArrayList<Pari<K, V>>[] arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new Lista[32];
        this.arvoja = 0;
    }

    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);
        if (this.arvot[hajautusArvo] == null) {
            return null;
        }

        Lista<Pari<K, V>> arvotIndeksissa = this.arvot[hajautusArvo];

        for (int i = 0; i < arvotIndeksissa.koko(); i++) {
            if (arvotIndeksissa.arvo(i).getAvain().equals(avain)) {
                return arvotIndeksissa.arvo(i).getArvo();
            }
        }

        return null;
    }
}
