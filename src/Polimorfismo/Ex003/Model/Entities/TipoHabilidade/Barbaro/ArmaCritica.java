package Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Barbaro;

import Polimorfismo.Ex003.Model.Entities.Descricao.Descricao;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Habilidade;

public class ArmaCritica extends Habilidade implements Descricao {
    public ArmaCritica() {
        super("Arma Crítica", "Ataque Curta Distancia", "Bárbaro");
    }
    @Override
    public void efeitoHabilidade(){
        System.out.println("Ao ativar essa habilidade, a arma que está na mão do lutador aumenta suar performance em 50% durante 60s");
    }
    @Override
    public String descricao(){
        return "Essa habilidade é muito útil em momentos que o seu lutador estiver em desvantagem contra um oponente" +
        "Com o aumento da performance da o seu lutador poderá finalizxar um inimigo mais forte";
    }

    @Override
    public String toString() {
        return "-------------------------" +
                "\nHABILIDADE" +
                "\nNome: " + getNomeHabilidade() +
                "\nTipo: " + getTipoHabilidade() +
                "\nLutador: " + getHabilidadeLutador() +
                "\n-------------------------";
    }
}
