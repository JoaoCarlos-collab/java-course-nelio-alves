package Generics.Ex003.Aplication;

import Generics.Ex003.Entities.Pessoa;

public class Main {
    public static void main (String[] args){

        Pessoa p1 = new Pessoa("João Carlos", "07042765427");
        Pessoa p2 = new Pessoa("João Carlos", "07042765427");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);

        String p3 = "João Carlos";
        String p4 = "João Carlos";

        System.out.println(p3 == p4);
    }
}
