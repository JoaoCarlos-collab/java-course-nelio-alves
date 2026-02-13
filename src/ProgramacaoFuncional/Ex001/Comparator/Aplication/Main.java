package ProgramacaoFuncional.Ex001.Comparator.Aplication;
import ProgramacaoFuncional.Ex001.Comparator.Entities.Pessoas.Pessoa;
import ProgramacaoFuncional.Ex001.Comparator.Factory.List.Lista;

public class Main {
    public static void main (String[] args){
        Lista lista = new Lista();
        Pessoa p1 = new Pessoa("João", 17);
        lista.adcList(p1);
        Pessoa p2 = new Pessoa("Maria", 20);
        lista.adcList(p2);
        Pessoa p3 = new Pessoa("Amanda", 30);
        lista.adcList(p3);
        Pessoa p4 = new Pessoa("Bruno", 35);
        lista.adcList(p4);
        Pessoa p5 = new Pessoa("Pedrão", 37);
        lista.adcList(p5);
        Pessoa p6 = new Pessoa("Amanda", 37);
        lista.adcList(p6);
        Pessoa p7 = new Pessoa("Amanda", 50);
        lista.adcList(p7);


        System.out.println("------------------------------------------------------");
        lista.exibirLista();
    }
}
