package Generics.Ex004.Factory.ListaCaminhoServidor;

import Generics.Ex004.Docs.GerarCaminho.Caminho;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mapservidor {
    private static Map<String, List<Caminho>> mapaServidores = new TreeMap<>();

    public static void criarSrvidor(String nomeServidor, String servico, String caminhoServidor){

        mapaServidores.putIfAbsent(nomeServidor, new ArrayList<>());
        mapaServidores.get(nomeServidor).add(new Caminho(nomeServidor,servico,caminhoServidor));

    }
}
