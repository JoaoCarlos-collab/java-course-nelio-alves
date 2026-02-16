package ProgramacaoFuncional.Ex003.ResolvendoProblema.Aplication;

import ProgramacaoFuncional.Ex003.ResolvendoProblema.Entities.Produto;
import ProgramacaoFuncional.Ex003.ResolvendoProblema.Factory.ListaProdutos;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Adicionando Produtos ---");

        // Itens com T (Para testar sua soma)
        ListaProdutos.adcLista(new Produto("TV 50 polegadas", 2500.00));
        ListaProdutos.adcLista(new Produto("Teclado Mecânico", 250.00));
        ListaProdutos.adcLista(new Produto("Tablet Samsung", 1200.00));

        // Itens com M (Para testar outro filtro)
        ListaProdutos.adcLista(new Produto("Mouse Gamer", 150.00));
        ListaProdutos.adcLista(new Produto("Monitor Dell", 1800.00));
        ListaProdutos.adcLista(new Produto("Mesa Digitalizadora", 400.00));

        // Itens variados (Para ver se o filtro ignora)
        ListaProdutos.adcLista(new Produto("Cadeira Ergonomica", 800.00));
        ListaProdutos.adcLista(new Produto("Creatina", 120.00)); // Um pouco de treino não faz mal haha
        ListaProdutos.adcLista(new Produto("Whey Protein", 200.00));
        System.out.println();
        System.out.println("\n--- Testando a Regra de Soma ---");

        // Deve somar apenas TV (2500) + Teclado (250) + Tablet (1200) = 3950.0
        ListaProdutos.regraSoma(p-> p.getNome().trim().startsWith("T"));

        System.out.println("-------------------------------");

        // Deve somar Mouse (150) + Monitor (1800) + Mesa (400) = 2350.0
        System.out.println();
        ListaProdutos.regraSoma(p-> p.getPreco() >= 1000.00);
    }
}