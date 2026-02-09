package Generics.Ex004.Factory.ListaGenerica;
import java.util.*;

public class Lista{
    private List<String> lista = new ArrayList<>();
    private Set<String> listaSet = new LinkedHashSet<>();

    public Lista() {}

    public void adcLista (String elemento){
        lista.add(elemento);
    }

    public void adcListaSet (String elemento){
        listaSet.add(elemento);
    }

    public void exiblista (){
        for(String lista : lista){
            System.out.println(lista);
        }
    }

    public void exibListaSet (){
        System.out.println("Numero de usuários que acessaram: "+listaSet.size());
        for(String setList : listaSet){
            System.out.println(setList);
        }
    }
}