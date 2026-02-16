package ProgramacaoFuncional.Ex001.Comparator.Factory.Lista;
import ProgramacaoFuncional.Ex001.Comparator.Entities.Produto.Produto;

import java.security.PKCS12Attribute;
import java.util.ArrayList;
import java.util.List;

public class Lista{

    private static List <Produto> listaProdutos = new ArrayList<>();

    public static void adcProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public static void ordenarProdutoNome(){
        listaProdutos.sort((p1,p2) -> p1.getNome().compareTo(p2.getNome()));
    }

    public static void ordenarProdutoPreco(){
        listaProdutos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
    }

    public static void imprimirLambda(){
        listaProdutos.forEach(produto -> System.out.println(produto));
    }

    public static void imprimirEncapsulamento(){
        listaProdutos.forEach(System.out::println);
    }
}
