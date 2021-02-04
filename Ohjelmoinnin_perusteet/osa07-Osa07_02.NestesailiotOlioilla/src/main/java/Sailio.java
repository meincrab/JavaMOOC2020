/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Sailio {

    private int ekaSailio;

    public int sisalto() {
        return ekaSailio;
    }

    public void lisaa(int maara) {
        if (maara >= 0) {
            ekaSailio = (ekaSailio + maara > 100) ? 100 : ekaSailio + maara;
        }
    }

    public void poista(int maara) {
        if (maara >= 0) {
            ekaSailio = (ekaSailio - maara < 0) ? 0 : ekaSailio - maara;
        }
    }

    public String toString() {
        return ekaSailio + "/100";
    }
}
