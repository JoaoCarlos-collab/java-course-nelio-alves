package ProgramacaoFuncional.Ex004.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.XMLFormatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args){

        List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream <Integer> st1 = listaInteiros.stream();
        Stream <Integer> st2 = listaInteiros.stream().map(x-> x * 10);
        Stream <Integer> st3 = listaInteiros.stream().map(x-> x * 10).filter(x -> x >= 50);
        int soma = listaInteiros.stream().mapToInt(x->x*20).sum();
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println(Arrays.toString(st3.toArray()));
        System.out.println(soma);

        Stream <String> st4 = Stream.of("Maria", "João", "Carlos", "Oliveira").filter(x-> x.equals("João") || x.equals("Carlos") || x.equals("Oliveira"));
        System.out.println(Arrays.toString(st4.toArray()));

        List <String> nomesPodem = Arrays.asList("João", "Carlos", "Oliveira");
        Stream <String> st5 = Stream.of("Maria", "João", "Carlos", "Oliveira").filter(x-> nomesPodem.contains(x));
        System.out.println(Arrays.toString(st5.toArray()));

        List<Double> exponêncial = Stream.iterate(2.0, x->Math.pow(x,2)).limit(10).toList();
        System.out.println(Arrays.toString(exponêncial.toArray()));

        Stream <Integer> st6 = listaInteiros.stream()
                .filter(x-> x % 2 == 0);
        System.out.println(Arrays.toString(st6.toArray()));

        Stream <Double> st7 = listaInteiros.stream()
                .filter(x-> x % 2 == 0)
                .map(x-> Math.pow(x,3));
        System.out.println(Arrays.toString(st7.toArray()));

    }
}
