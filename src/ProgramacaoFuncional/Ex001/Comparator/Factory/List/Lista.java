package ProgramacaoFuncional.Ex001.Comparator.Factory.List;
import ProgramacaoFuncional.Ex001.Comparator.Entities.Pessoas.Pessoa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista {
    private static List <Pessoa> listaPessoas = new ArrayList<>();

    public Lista() {
    }

    public static void adcList(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    public static void exibirLista(){
        listaPessoas.forEach(System.out::println);
    }

    public static int ordenarNomeIdade(Pessoa p1, Pessoa p2){
        int compareNome = p1.getNome().compareTo(p2.getNome());

        if(compareNome != 0){
            return compareNome;
        }

        return p1.getIdadeString().compareTo(p2.getIdadeString());
    }

    public static void ordenarNomeIdadeFuncionando(){
        listaPessoas.sort(Lista::ordenarNomeIdade);
        listaPessoas.forEach(pessoa -> System.out.println(pessoa));
    }

    public static void ordenarNomeIdadeFuncional(){
        listaPessoas.sort(
                Comparator.comparing(Pessoa::getNome)
                        .thenComparing(
                                Comparator.comparing(Pessoa::getIdade).reversed()));

        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa);
        }
    }
}
