package ProgramacaoFuncional.Comparator.Factory.List;
import ProgramacaoFuncional.Comparator.Entities.Pessoas.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista {
    private List <Pessoa> listaPessoas = new ArrayList<>();

    public Lista() {
    }

    public void adcList(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    public void listaOrdenadaNomeIdade(){
        listaPessoas.sort(
                Comparator.comparing(Pessoa::getNome)
                        .thenComparing(
                                Comparator.comparing(Pessoa::getIdade).reversed()));

        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa);
        }
    }
}
