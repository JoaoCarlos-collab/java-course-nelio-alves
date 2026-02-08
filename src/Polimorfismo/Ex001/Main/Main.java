package Polimorfismo.Ex001.Main;

import Polimorfismo.Ex001.Model.Funcionario;
import Polimorfismo.Ex001.Model.FuncionarioTerceri;
import Polimorfismo.Ex001.Repository.FichaTecFunc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        FichaTecFunc array = new FichaTecFunc();

        System.out.println("----------------------------------------------------------");
        System.out.print("Digite a quantidade de funcionários que deseja registrar: ");
        int quantFunc = scanner.nextInt();
        scanner.nextLine();




        for (int i = 0; i < quantFunc; i++){
            System.out.println("----------------------------------------------------------");
            System.out.println("1 - Funcionário normal");
            System.out.println("2 - Funcionário Terceirizado");
            System.out.print("Digite o número do tipo de funcionário: ");
            int tipoFunc = scanner.nextInt();
            scanner.nextLine();
            System.out.println("----------------------------------------");



            if (tipoFunc == 1){
                System.out.printf("%d° Funcionário %n",i+1);
                System.out.println("----------------------------------------");
                System.out.print("Digite o nome do funcionário: ");
                String nomeFunc = scanner.nextLine();
                System.out.print("Digite o valor da hora de trabalho: ");
                Double valorHora = scanner.nextDouble();
                System.out.print("Digite a quantidade de horas trabalhadas: ");
                Double horasTrab = scanner.nextDouble();

                Funcionario f1 = new Funcionario(nomeFunc, valorHora, horasTrab);
                array.adicionarFunc(f1);
            }

            else if (tipoFunc == 2) {
                System.out.printf("%d° Funcionário %n",i+1);
                System.out.println("----------------------------------------");
                System.out.print("Digite o nome do funcionário: ");
                String nomeFunc = scanner.nextLine();
                System.out.print("Digite o valor da hora de trabalho: ");
                Double valorHora = scanner.nextDouble();
                System.out.print("Digite a quantidade de horas trabalhadas: ");
                Double horasTrab = scanner.nextDouble();
                System.out.print("Digite o valor adicional: ");
                BigDecimal valorAdic = scanner.nextBigDecimal();
                System.out.println("----------------------------------------------------------");

                FuncionarioTerceri ft1 = new FuncionarioTerceri(nomeFunc, valorHora, horasTrab, valorAdic);
                array.adicionarFunc(ft1);
            }
        }

        array.exibirFunc();

    scanner.close();
    }
}
