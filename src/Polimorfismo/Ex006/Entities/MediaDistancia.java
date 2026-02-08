package Polimorfismo.Ex006.Entities;

public interface MediaDistancia {

    String getTipo();

    default String mediaDistancia(){
        return "O " + getTipo() + " tem uma distancia de ataque de 500 unidades (media distância)";
    }
}
