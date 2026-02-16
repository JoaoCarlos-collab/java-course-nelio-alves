package ProgramacaoFuncional.Ex004.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args){
        List<Integer> listaInteiros = Arrays.asList(1,2,3,4,5,6,7);
        Stream <Integer> st1 = listaInteiros.stream();
        Stream <Integer> st2 = listaInteiros.stream().map(x-> x * 10);
        Stream <Integer> st3 = listaInteiros.stream().map(x-> x * 10).filter(x -> x >= 50);
        int soma = listaInteiros.stream().mapToInt(x->x*20).sum();
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println(Arrays.toString(st3.toArray()));
        System.out.println(soma);
    }
}
