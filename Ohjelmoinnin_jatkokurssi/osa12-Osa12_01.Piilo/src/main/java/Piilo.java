/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meincrab
 */
public class Piilo<T> {

    private T elementti;
    public void laitaPiiloon(T piilotettava) {
        if(elementti != null) {
            elementti = null;
        }
        elementti = piilotettava;
    }

    public T otaPiilosta() {
        if(onkoPiilossa()){
            T tulos = elementti;
            elementti = null;
            return tulos;
        }
        return elementti;
    }

    public boolean onkoPiilossa() {
        return elementti != null;
    }
}
