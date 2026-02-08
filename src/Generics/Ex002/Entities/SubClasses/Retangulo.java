package Generics.Ex002.Entities.SubClasses;

import Generics.Ex002.Entities.Interface.Forma;

public class Retangulo implements Forma {
    private Double lado1;
    private Double lado2;

    public Retangulo() {}

    public Retangulo(Double lado1, Double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public Double area() {
        return getLado1()*getLado2();
    }
}