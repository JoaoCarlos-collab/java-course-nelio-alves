package ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service;
import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.entities.Produto;
import java.util.function.Function;

public class ProdutoFunction implements Function <Produto, String>{

    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
