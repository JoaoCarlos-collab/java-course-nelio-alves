package Generics.Ex001.Aplication;
import Generics.Ex001.Entities.Lista;
import java.util.Scanner;

public class Main {
    public void main (String[] args){

        Lista novaLista = new Lista<>();

        Scanner sc = new Scanner(System.in);

        int numEle = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numEle; i++){

            String num = sc.nextLine();
            novaLista.adcLista(num);

        }

        System.out.println(novaLista.primeiroEle());
        novaLista.listaEle();
        sc.close();
    }
}
