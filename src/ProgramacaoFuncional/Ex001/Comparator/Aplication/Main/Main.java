package ProgramacaoFuncional.Ex001.Comparator.Aplication.Main;

import ProgramacaoFuncional.Ex001.Comparator.Entities.Produto.Produto;
import ProgramacaoFuncional.Ex001.Comparator.Factory.Lista.Lista;

public class Main {
    public static void main (String[] args){

        Produto p1 = new Produto("Tv", 1000.00);
        Lista.adcProduto(p1);
        Produto p2 = new Produto("Celular", 2000.00);
        Lista.adcProduto(p2);
        Produto p3 = new Produto("Caixa de Som", 5000.00);
        Lista.adcProduto(p3);
        Produto p4 = new Produto("Moto", 20000.00);
        Lista.adcProduto(p4);

        System.out.println("---------------------------------------------------");
        System.out.println("Lista desordenada");
        Lista.imprimirLambda();
        System.out.println("---------------------------------------------------");
        System.out.println("Lista ordenada por nome");
        Lista.ordenarProdutoNome();
        Lista.imprimirLambda();
        System.out.println("---------------------------------------------------");
        System.out.println("Lista ordenada por preço");
        Lista.ordenarProdutoPreco();
        Lista.imprimirEncapsulamento();
    }
}
