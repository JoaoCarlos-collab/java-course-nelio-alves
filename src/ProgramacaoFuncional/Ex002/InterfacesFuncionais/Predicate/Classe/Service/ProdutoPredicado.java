package ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service;

import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.entities.Produto;

import java.util.Comparator;
import java.util.function.Predicate;

public class ProdutoPredicado implements Predicate<Produto>, Comparator<Produto> {

    public ProdutoPredicado() {
    }

    @Override
    public boolean test (Produto produto){
        return produto.getpreco() > 1000.00;
    }

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getpreco().compareTo(p2.getpreco());
    }
}
