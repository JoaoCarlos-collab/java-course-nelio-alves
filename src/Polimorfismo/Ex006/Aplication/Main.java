package Polimorfismo.Ex006.Aplication;

import Polimorfismo.Ex006.Entities.Arqueiro;
import Polimorfismo.Ex006.Entities.Assassino;
import Polimorfismo.Ex006.Entities.Espadachim;
import Polimorfismo.Ex006.Entities.Tanque;

public class Main {
    public static void main (String[] args){

        Assassino assassino = new Assassino("Felix");
        System.out.println(assassino.curtaDistancia());
        System.out.println(assassino.horaDoCombate());
        System.out.println();
        Tanque tanque = new Tanque("Dromedáryus");
        System.out.println(tanque.curtaDistancia());
        System.out.println(tanque.horaDoCombate());
        System.out.println();
        Espadachim espadachim = new Espadachim("Espadachin-Negro");
        System.out.println(espadachim.mediaDistancia());
        System.out.println(espadachim.horaDoCombate());
        System.out.println();
        Arqueiro arqueiro = new Arqueiro("Nanatsu");
        System.out.println(arqueiro.longaDistancia());
        System.out.println(arqueiro.horaDoCombate());
        System.out.println();


    }
}
