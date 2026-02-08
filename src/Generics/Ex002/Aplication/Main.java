package Generics.Ex002.Aplication;

import Generics.Ex002.Entities.Generic.CalcularArea;
import Generics.Ex002.Entities.Generic.Lista;
import Generics.Ex002.Entities.SubClasses.Circulo;

public class Main {
    public static void main (String[] args) {

        Lista<Circulo> circuloRep = new Lista<>();
        circuloRep.adcLista(new Circulo(1.0));
        circuloRep.adcLista(new Circulo(2.0));

        CalcularArea calcularArea = new CalcularArea();
        System.out.println(calcularArea.somaArea(circuloRep));


    }
}