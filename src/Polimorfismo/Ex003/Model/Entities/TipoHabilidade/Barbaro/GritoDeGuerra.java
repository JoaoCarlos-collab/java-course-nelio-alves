package Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Barbaro;

import Polimorfismo.Ex003.Model.Entities.Descricao.Descricao;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Habilidade;

public class GritoDeGuerra extends Habilidade implements Descricao {

    public GritoDeGuerra() {
        super("Grito de Guerra", "Controle de Grupo", "Bárbaro");
    }

    @Override
    public void efeitoHabilidade() {
        // Como no seu modelo é void, usamos o print
        System.out.println("O Bárbaro estufa o peito e solta um rugido aterrorizante!");
        System.out.println("Todos os inimigos num raio de 10m ficam com medo, reduzindo a defesa deles em 20%.");
    }

    @Override
    public String descricao() {
        return "Habilidade usada para intimidar exércitos inteiros. " +
                "Ao verem a fúria do Bárbaro, os inimigos hesitam em atacar, " +
                "abrindo guarda para golpes devastadores.";
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