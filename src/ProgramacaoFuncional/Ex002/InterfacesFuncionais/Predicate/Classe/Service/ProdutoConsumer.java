package ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.Service;

import ProgramacaoFuncional.Ex002.InterfacesFuncionais.Predicate.Classe.entities.Produto;

import java.util.function.Consumer;

public class ProdutoConsumer implements Consumer <Produto> {


    @Override
    public void accept(Produto produto) {
        produto.setPreco((produto.getpreco()*110)/100);
    }
}
