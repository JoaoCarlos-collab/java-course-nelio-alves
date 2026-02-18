package ProgramacaoFuncional.Ex005.Aplication;

import ProgramacaoFuncional.Ex005.Lista.ListaProdutos;
import ProgramacaoFuncional.Ex005.Produto.Produto;

public class Main {
    public static void main (String[] args){
        Produto p1 = new Produto("Tv", 5000.00);
        ListaProdutos.adcProduto(p1);
        Produto p2 = new Produto("Som", 5000.00);
        ListaProdutos.adcProduto(p2);
        Produto p3 = new Produto("Celular", 3000.00);
        ListaProdutos.adcProduto(p3);
        Produto p4 = new Produto("Notebook", 5000.00);
        ListaProdutos.adcProduto(p4);
        Produto p5 = new Produto("Avestruz", 15000.00);
        ListaProdutos.adcProduto(p5);
        Produto p6 = new Produto("Suricate 2.0", 20000.00);
        ListaProdutos.adcProduto(p6);
        Produto p7 = new Produto("ornitorrinco", 15000.00);
        ListaProdutos.adcProduto(p7);
        ListaProdutos.somaPrecos();
    }
}
