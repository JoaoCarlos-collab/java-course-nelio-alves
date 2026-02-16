package ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Factory;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service.ProdutoConsumer;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service.ProdutoFunction;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service.ProdutoPredicado;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.entities.Produto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lista {
    private static List<Produto> listaProdutos = new ArrayList<>();

    public static void adcProduto(Produto produto){
        listaProdutos.add(produto);
    }

    public static void exibirLista(){
        listaProdutos.forEach(System.out::println);
    }

    public static void removerPorClasse(){
        listaProdutos.removeIf(new ProdutoPredicado());
        listaProdutos.forEach(produto -> System.out.println(produto));
    }

    public static void removerPorMetodo(Predicate<Produto> produto){
        listaProdutos.removeIf(produto);
        listaProdutos.forEach(System.out::println);
    }

    public static void removerPorVariavel(Double valorMinimo){
        Predicate <Produto> remover = produto -> produto.getpreco() >= valorMinimo;
        listaProdutos.removeIf(remover);
        listaProdutos.forEach(System.out::println);
    }

    public static void ordenarPorClasse(){
        listaProdutos.sort(new ProdutoPredicado());
        listaProdutos.forEach(System.out::println);
    }

    public static void ordenarPorMetodo(Comparator <Produto> produto){
        listaProdutos.sort(produto);
        listaProdutos.forEach(System.out::println);
    }

    public static void aumentarPrecoPorClasse(){
        listaProdutos.forEach(new ProdutoConsumer());
        listaProdutos.forEach(System.out::println);
    }

    public static void aumentarPrecoParametro(Consumer<Produto> produto){
        listaProdutos.forEach(produto);
        listaProdutos.forEach(System.out::println);
    }

    public static void aumentarPrecoPorVariavel(Double aumento){
        listaProdutos.forEach(produto -> produto.setPreco(produto.getpreco()*((aumento+100)/100)));
        listaProdutos.forEach(System.out::println);
    }

    public static void functionPorClasse(){
        List<String> nomes = listaProdutos.stream().map(new ProdutoFunction()).collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }

    public static String PreparandofunctionPorMetodo(Produto p){
        return p.getNome().toUpperCase();
    }

    public static void functionPorMetodo(){
        List<String> nomes = listaProdutos.stream().map(Lista::PreparandofunctionPorMetodo).collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }

    public static void functionPorParametros (Function<Produto, String> produtos){
        List<String> nomes = listaProdutos.stream().map(produtos).collect(Collectors.toList());
        nomes.forEach(System.out::println);
    }
}
