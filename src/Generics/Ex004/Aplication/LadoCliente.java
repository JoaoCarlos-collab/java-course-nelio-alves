package Generics.Ex004.Aplication;

import Generics.Ex004.Entities.Usuario.Usuario;
import Generics.Ex004.Factory.ServidorGeral.Mapservidor;

import java.util.Scanner;

public class LadoCliente {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite 1 para entrar em um servidor");
            System.out.println("Digite 2 para ver o registro de requisições");
            System.out.println("Digite 0 para fechar o programa");
            System.out.print("Digite o número que deseja: ");
            int criarPasta = sc.nextInt();
            sc.nextLine();

            if (criarPasta == 1){
                System.out.print("Digite o nome do servidor: ");
                String nomeServidor = sc.nextLine();
                System.out.print("Digite o nome do serviço: ");
                String nomeServico = sc.nextLine();
                System.out.print("Digite seu nome de usuário: ");
                String nomeUsuario = sc.nextLine();
                Usuario usuario = new Usuario(nomeUsuario);
                Mapservidor.entrarServidor(nomeServidor,nomeServico,usuario);
            }

            else if (criarPasta == 2) {
                System.out.print("Digite o nome do servidor: ");
                String nomeServidor = sc.nextLine();
                System.out.print("Digite o nome do serviço: ");
                String nomeServico = sc.nextLine();
                Mapservidor.relatorioAcesso(nomeServidor, nomeServico);
            }

            else {
                System.out.println("Operação encerrada");
                System.exit(0);
            }
        }

        catch (Exception e) {
            System.out.println("Você digitou uma letra ao invés de um número");
        }

        finally {
            sc.close();
        }
    }
}
