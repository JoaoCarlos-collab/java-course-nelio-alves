package Generics.Ex002.Entities.Generic;
import Generics.Ex002.Entities.Interface.Forma;
public class CalcularArea {

    public Double somaArea(Lista<? extends Forma> areas){

        Double soma = 0.0;
        for (Forma a : areas.getLista()){
            soma += a.area();
        }
        return soma;
    }
}
