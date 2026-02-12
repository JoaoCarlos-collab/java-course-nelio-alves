package Generics.Ex004.Aplication;

import Generics.Ex004.Factory.ServidorGeral.Mapservidor;

import java.util.Scanner;

public class LadoServidor {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Digite 1 para criar um servidor");
            System.out.println("Digite 0 para fechar o programa");
            System.out.print("Digite o número que deseja: ");
            int criarPasta = sc.nextInt();
            sc.nextLine();
            if (criarPasta == 1){
                System.out.print("Digite o nome do servidor: ");
                String nomeServidor = sc.nextLine();
                System.out.print("Digite o nome do serviço: ");
                String nomeServico = sc.nextLine();
                Mapservidor.criarServidor(nomeServidor, nomeServico);
            }

            else {
                System.out.println("Operação encerrada");
                System.exit(0);
            }

        }

        catch (Exception e) {
            System.out.println("Você digitou um texto ao inves de um número (1 ou 0) ");
        }

        finally {
            sc.close();
        }
    }
}
