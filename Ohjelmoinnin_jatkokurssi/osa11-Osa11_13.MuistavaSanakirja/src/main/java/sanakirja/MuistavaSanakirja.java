/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

/**
 *
 * @author meincrab
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MuistavaSanakirja {

    private Map<String, String> sanakirja;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = tiedosto;
    }

    public boolean lataa() {
        try {
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                lisaa(osat[0], osat[1]);
            }
            return true;
        } catch (IOException x) {
            System.out.println("Virhe" + x.getMessage());
            return false;
        }
    }

    public boolean tallenna() {
        try {
            PrintWriter kirjoittaja = new PrintWriter(tiedosto);
            List<String> tallennettu = new ArrayList<>();

            sanakirja.keySet().stream().forEach(x -> {
                if (tallennettu.contains(x)) {
                    return;
                }
                kirjoittaja.println(x + ":" + sanakirja.get(x));
                tallennettu.add(x);
                tallennettu.add(sanakirja.get(x));
            });

            kirjoittaja.close();
            return true;

        } catch (IOException x) {
            System.out.println("Virhe" + x.getMessage());
            return false;
        }
    }

    public void lisaa(String sana, String kaannos) {
        sanakirja.putIfAbsent(sana, kaannos);
    }

    public String kaanna(String sana) {
        String kaannos = sanakirja.getOrDefault(sana, null);
        if (kaannos == null) {
            kaannos = sanakirja.entrySet().stream().filter(x -> x.getValue().equals(sana)).findAny().map(y -> y.getKey()).orElse(null);
        }
        return kaannos;
    }

    public void poista(String sana) {
        if (sanakirja.remove(sana) == null) {
            sanakirja.values().removeIf(x -> x.contains(sana));
        }
    }

}
