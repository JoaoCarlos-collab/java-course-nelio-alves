package datas.global;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ListaFusos {
    public static void main(String[] args) {
        // Pega todos os IDs disponíveis no sistema
        Set<String> todosFusos = ZoneId.getAvailableZoneIds();

        // Converte para lista para podermos ordenar por ordem alfabética
        List<String> listaOrdenada = new ArrayList<>(todosFusos);
        Collections.sort(listaOrdenada);

        // Imprime cada um deles
        for (String id : listaOrdenada) {
            System.out.println(id);
        }

        System.out.println("Total de fusos: " + listaOrdenada.size());
    }
}