package Polimorfismo.Ex003.Model.Entities.TipoArma.Barbaro;

import Polimorfismo.Ex003.Model.Entities.Descricao.Descricao;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Arma;

public class MachadoGlacial extends Arma implements Descricao {

    public MachadoGlacial() {
        super("Machado Glacial", "Guerreiro");
        setNomeArma("Machado Glacial");
        setArmaLutador("Guerreiro");
    }

    @Override
    public String efeitoArma() {
        return "Ao atingir o oponente, o frio intenso congela as articulações inimigas.\n" +
                "Causa lentidão de 30% no movimento do inimigo e 10 de dano por gelo.\n" +
                "Há uma chance de 15% de congelar o oponente completamente por 2 segundos,\n" +
                "deixando-o vulnerável a um ataque crítico fatal.\n";
    }

    @Override
    public String descricao() {
        return "Um machado duplo feito de gelo eterno que nunca derrete, encontrado no pico mais alto do Norte.";
    }

    @Override
    public String toString() {
        return  "-----------------------" +
                "\nARMA" +
                "\nNome: " + getNomeArma() +
                "\nTipo de lutador: " + getArmaLutador() +
                "\nEfeito da Arma: " + efeitoArma() + // O efeito retorna String, então aparece aqui
                "\n------------------------";
    }
}