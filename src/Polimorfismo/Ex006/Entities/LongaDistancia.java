package Polimorfismo.Ex006.Entities;

public interface LongaDistancia {

    String getTipo();

    default String longaDistancia(){
        return "O " + getTipo() + " tem uma distancia de ataque de 1000 unidades (longa distância)";
    }
}
