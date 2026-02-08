package Generics.Ex001.Entities;

import java.util.ArrayList;

public class Lista <T>{

    private ArrayList<T> lista = new ArrayList<>();

    public Lista() {}

    public void adcLista (T elemento){
        lista.add(elemento);
    }

    public T primeiroEle (){
        T priEleme = null;
        if (lista.isEmpty()){

        }

        else {
            priEleme = lista.get(0);
        }

        return priEleme;
    }

    public void listaEle(){
        if (lista.isEmpty()){
            System.out.println("A sua lista está vazia");
        }

        else {
            System.out.print("[");
            System.out.print(lista.get(0));
            for (int i = 1; i < lista.size(); i++){
                System.out.print(", "+lista.get(i));
            }
            System.out.print("]");
        }

    }
}
