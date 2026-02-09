package Generics.Ex004.Aplication;

import java.util.Scanner;

public class LadoServidor {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Digite 1 para criar um servido");
            System.out.println("Digite 0 para fechar o programa");
            int criarPasta = sc.nextInt();
            sc.nextLine();
            if (criarPasta == 1){

            }

        } catch (Exception e) {
            System.out.println("Você digitou um texto ao inves de um número (1 ou 0) ");
        }finally {
            sc.close();
        }
    }
}
