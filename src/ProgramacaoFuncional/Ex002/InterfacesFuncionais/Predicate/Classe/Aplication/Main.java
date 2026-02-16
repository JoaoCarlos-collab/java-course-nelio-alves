package ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Aplication;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Factory.Lista;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.entities.Produto;

public class Main {
    public static void main (String[] args){

        Produto p1 = new Produto("Tv", 2000.00);
        Produto p2 = new Produto("Som", 1000.00);
        Produto p3 = new Produto("Batedeira", 200.00);
        Produto p4 = new Produto("Liquidificador", 100.00);

        Lista.adcProduto(p1);
        Lista.adcProduto(p2);
        Lista.adcProduto(p3);
        Lista.adcProduto(p4);

        System.out.println("------------------------------------------------------------");
        System.out.println("exibirLista()");
        System.out.println("------------------------------------------------------------");
        Lista.exibirLista();
        System.out.println("------------------------------------------------------------");
        System.out.println("aumentarPrecoPorClasse()");
        System.out.println("------------------------------------------------------------");
        Lista.aumentarPrecoPorClasse();
        System.out.println("------------------------------------------------------------");
        System.out.println("aumentarPrecoParametro()");
        System.out.println("------------------------------------------------------------");
        Lista.aumentarPrecoParametro(produto -> produto.setPreco((produto.getpreco()*200)/100));
        System.out.println("------------------------------------------------------------");
        System.out.println("aumentarPrecoPorVariavel()");
        System.out.println("------------------------------------------------------------");
        Lista.aumentarPrecoPorVariavel(50.00);
        System.out.println("------------------------------------------------------------");
        System.out.println("functionPorClasse()");
        System.out.println("------------------------------------------------------------");
        Lista.functionPorClasse();
        System.out.println("------------------------------------------------------------");
        System.out.println("public static void functionPorMetodo()");
        System.out.println("------------------------------------------------------------");
        Lista.functionPorMetodo();
        System.out.println("------------------------------------------------------------");
        System.out.println("public static void functionPorParametro()");
        System.out.println("------------------------------------------------------------");
        Lista.functionPorParametros((Produto produto1) -> produto1.getNome().toUpperCase());
        System.out.println("------------------------------------------------------------");
        System.out.println("removerPorClasse()");
        System.out.println("------------------------------------------------------------");
        Lista.removerPorClasse();
        System.out.println("------------------------------------------------------------");
        System.out.println("removerPorMetodo()");
        System.out.println("------------------------------------------------------------");
        Lista.removerPorMetodo(produto -> produto.getpreco() >= 2000.00);
        System.out.println("------------------------------------------------------------");
        System.out.println("removerPorVariavel()");
        System.out.println("------------------------------------------------------------");
        Lista.removerPorVariavel(2000.00);
        System.out.println("------------------------------------------------------------");
        System.out.println("ordenarPorClasse()");
        System.out.println("------------------------------------------------------------");
        Lista.ordenarPorClasse();
        System.out.println("------------------------------------------------------------");
        System.out.println("ordenarPorMetodo()");
        System.out.println("------------------------------------------------------------");
        Lista.ordenarPorMetodo((produto1, produto2) -> produto1.getNome().compareTo(produto2.getNome()));
    }
}
