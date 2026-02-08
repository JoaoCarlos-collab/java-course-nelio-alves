package Polimorfismo.Ex003.Model.Entities.TipoArma.Barbaro;

import Polimorfismo.Ex003.Model.Entities.Descricao.Descricao;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Arma;

public class EspadaFogo extends Arma implements Descricao{

    protected Descricao descricao;
    public EspadaFogo() {
        super("Espada de Fogo", "Guerreiro");
        setNomeArma("Espada de Fogo");
        setArmaLutador("Guerreiro");
    }


    @Override
    public String efeitoArma(){
        return "Em campo de batalha ao ferir seu oponente causará um dano de 15 HP de imediato, além de danos de 5 HP/s durante 5s\n" +
        "O lutador que empunhar tal espada, com o decorrer do tempo irá ter seu corpo flamejante\n" +
        "Fazendo com que o lutador e a espada se tornem um só\n" +
        "E assim, aumentando o HP, força e velocidade do lutador em até 10%\n";
    }

    @Override
    public String descricao(){
        return "Espada longa, com lâmina flamejante forjada no própio Hades";
    }

    @Override
    public String toString() {
        return  "-----------------------" +
                "\nARMA" +
                "\nNome: " + getNomeArma() +
                "\nTipo de lutador: " + getArmaLutador() +
                "\nEfeito da Arma " + efeitoArma() +
                "\n------------------------" ;
    }
}
