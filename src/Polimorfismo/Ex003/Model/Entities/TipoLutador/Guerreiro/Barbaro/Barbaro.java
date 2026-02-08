package Polimorfismo.Ex003.Model.Entities.TipoLutador.Guerreiro.Barbaro;
import Polimorfismo.Ex003.Model.Entities.Descricao.Descricao;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Arma;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Habilidade;
import Polimorfismo.Ex003.Model.Entities.TipoLutador.Lutador.Lutador;

public class Barbaro extends Lutador implements Descricao {
    private String descricao;

    public Barbaro(Arma arma, Habilidade habilidades ) {
        super("Nórdico", 200, arma, habilidades, "Guerreiro");
        this.descricao = "\nUm guerreiro cuja pele tem a palidez de cadáveres congelados.\n" +
                "Ele não respira e seus olhos são dois poços negros que não refletem luz. \n" +
                "Dizem que a neblina que o cerca carrega os sussurros agonizantes de todas as almas que sua lâmina já ceifou. \n" +
                "Ele não luta por honra, mas para calar as vozes em sua cabeça.\n";
    }
    @Override
    public void andar(){
        System.out.printf("%s está marchando pesado\n", getNome());
    }
    @Override
    public void falaUm(){
        System.out.println("Esmagar os teus inimigos. Vê-los fugir diante de ti. E ouvir o lamento das suas mulheres");
    }

    @Override
    public void falaDois(){
        System.out.println("O que não pode ser morto, pode ser cortado em dois.");
    }

    @Override
    public String descricao(){
         return  "-----------------------------------------" +
                 "\nLUTADOR" +
                 "\nNome: " + getNome() +
                 "\nHP: " + getHP() +
                 "\nTipo de lutador: " + getTipoLutador() +"\n"+
                 "Descrição: " + descricao+ "\n" +
                 getArma() +
                 getHabilidades() +
                 "\n-----------------------------------------";

    }
}
