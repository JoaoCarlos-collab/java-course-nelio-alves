package Generics.Ex002.Entities.Generic;

import java.util.ArrayList;
import java.util.List;

public class Lista <T>{
    private List<T> lista = new ArrayList<>();

    public Lista() {}

    public List<T> getLista() {
        return lista;
    }

    public void adcLista(T elemento) {
        this.lista.add(elemento);
    }
}