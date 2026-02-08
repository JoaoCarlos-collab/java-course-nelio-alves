package listas.aumentoSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        List <Pessoa> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1 - Você deseja cadastrar um novo usuário ? ");
            System.out.println("2 - Você deseja aumentar o salário de um usuário ? ");
            System.out.println("0 - Sair ");
            System.out.print("Digite o número que deseja: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1){
                int quantCad = 0;
                while(true){
                    System.out.println("Cadastro de pessoas");
                    System.out.println("Você deseja cadastrar um novo usuário ? ");
                    System.out.print("1 - Sim | 0 - Não : ");
                    int cadPes = sc.nextInt();
                    sc.nextLine();

                    if (cadPes == 1){
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Salário: ");
                        double salario = sc.nextDouble();
                        lista.add(new Pessoa(nome, salario));
                        System.out.println("Pessoa cadastrada com sucesso !");

                        System.out.println("Id: "+lista.get(quantCad).getId());
                        System.out.println("Nome: "+lista.get(quantCad).getNome());
                        System.out.println("Salário: "+lista.get(quantCad).getSalario());
                        quantCad += 1;
                    }

                    else {
                        System.out.println("Finalizando...");
                        break;
                    }
                }
            }

            else if(menu == 2){
                while(true){
                    System.out.println("Aumentar salário");
                    System.out.println("Você deseja aumentar o salário de um usuário ? ");
                    System.out.print("1 - Sim | 0 - Não : ");
                    int salPes = sc.nextInt();
                    sc.nextLine();

                    if(salPes == 1){
                        System.out.println("Pessoas já cadastradas");
                        for (Pessoa f : lista){

                            System.out.println("Id: "+ f.getId());
                            System.out.println("Nome: "+ f.getNome());
                            System.out.println("Salário: "+ f.getSalario());
                            System.out.println("-----------------------------");
                        }

                        System.out.print("Digite o id do funcionário: ");
                        int id = sc.nextInt();
                        System.out.println("Nome: "+ lista.get(id - 1).getNome());
                        System.out.println("Salário: "+ lista.get(id - 1).getSalario());
                        System.out.print("Digite a porcentagem de aumento(Ex: Digite 50 para aumentar 50%): ");
                        double porc = sc.nextDouble();
                        lista.get(id - 1).AumentarSalario(porc);
                        System.out.println("Novo salário: "+ lista.get(id - 1).getSalario());

                    }else {
                        System.out.println("Encerrando....");
                        break;
                    }
                }
            }

            else {
                System.out.println("Encerrando...");
                break;
            }
        }
    }
}
