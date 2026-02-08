package Generics.Ex002.Entities.SubClasses;
import Generics.Ex002.Entities.Interface.Forma;

public class Circulo implements Forma {
    private Double raio;
    private static final Double Pi = 3.14;

    public Circulo() {}

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Pi * Math.pow(getRaio(),2);
    }
}