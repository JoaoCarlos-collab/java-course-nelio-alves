package ProgramacaoFuncional.Ex005.Lista;

import ProgramacaoFuncional.Ex005.Produto.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListaProdutos {
    private static List <Produto> listaProdutos = new ArrayList<>();

    public static void adcProduto(Produto p){
        listaProdutos.add(p);
    }

    public static void somaPrecos(){

        Stream <Produto> st1 = listaProdutos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed().thenComparing(Produto::getNome));
                st1.forEach(System.out::println);

        Double soma = listaProdutos.stream()
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
                System.out.println("Soma dos preços dos produtos: "+soma);
    }
}
