package Polimorfismo.Ex006.Entities;

public interface CurtaDistancia {

    String getTipo();

    default String curtaDistancia(){
        return "O " + getTipo() + " tem uma distancia de ataque de 100 unidades (curta distância)";
    }
}
