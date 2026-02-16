package ProgramacaoFuncional.Ex003.ResolvendoProblema.Factory;

import ProgramacaoFuncional.Ex003.ResolvendoProblema.Entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListaProdutos {
    private static List <Produto> listaProdutos = new ArrayList<>();

    public ListaProdutos() {
    }

    public static void adcLista(Produto produto){
        listaProdutos.add(produto);
        listaProdutos.forEach(System.out::println);
    }

    public static void regraSoma(Predicate<Produto> p){
        Double soma = listaProdutos
                .stream()
                .filter(p)
                .mapToDouble(Produto::getPreco)
                .sum();
        listaProdutos.forEach(System.out::println);
        System.out.println();
        System.out.println("Soma dos preços dos produtos "+soma);
    }
}
