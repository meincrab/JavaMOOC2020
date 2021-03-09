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

public class Laatikko implements Talletettava {

    private double maksimiKapasiteetti;
    private ArrayList<Talletettava> tavaraLaatikossa;

    public Laatikko(double maksimiKapasiteetti) {
        this.maksimiKapasiteetti = maksimiKapasiteetti;
        this.tavaraLaatikossa = new ArrayList<>();
    }

    public void lisaa(Talletettava tavara) {
        if (this.paino() + tavara.paino() <= maksimiKapasiteetti) {
            tavaraLaatikossa.add(tavara);
        }
    }

    @Override
    public double paino() {
        double summa = 0.0;

        for (Talletettava t : tavaraLaatikossa) {
            summa += t.paino();
        }

        return summa;
    }

    @Override
    public String toString() {
        return "Laatikko: "+ tavaraLaatikossa.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }

}
