package ProgramacaoFuncional.Ex001.Comparator.Aplication;
import ProgramacaoFuncional.Ex001.Comparator.Entities.Pessoas.Pessoa;
import ProgramacaoFuncional.Ex001.Comparator.Factory.List.Lista;

public class Main {

    public static void main (String[] args){

        Pessoa p1 = new Pessoa("João", 17);
        Lista.adcList(p1);
        Pessoa p2 = new Pessoa("Maria", 20);
        Lista.adcList(p2);
        Pessoa p3 = new Pessoa("Amanda", 30);
        Lista.adcList(p3);
        Pessoa p4 = new Pessoa("Bruno", 35);
        Lista.adcList(p4);
        Pessoa p5 = new Pessoa("Pedrão", 37);
        Lista.adcList(p5);
        Pessoa p6 = new Pessoa("Amanda", 37);
        Lista.adcList(p6);
        Pessoa p7 = new Pessoa("Amanda", 50);
        Lista.adcList(p7);


        System.out.println("------------------------------------------------------");
        System.out.println("exibirLista()");
        Lista.exibirLista();
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("ordenarNomeIdadeFuncionando()");
        Lista.ordenarNomeIdadeFuncionando();
        System.out.println("------------------------------------------------------");

        System.out.println("------------------------------------------------------");
        System.out.println("ordenarNomeIdadeFuncional()");
        Lista.ordenarNomeIdadeFuncional();
        System.out.println("------------------------------------------------------");

    }
}
