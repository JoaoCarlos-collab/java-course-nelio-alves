package Enumerações.SistemaContratos.Aplication;
import Enumerações.SistemaContratos.Entities.Contratos.Contratos;
import Enumerações.SistemaContratos.Entities.Departamento.Departamento;
import Enumerações.SistemaContratos.Entities.Enumeracao.Enumeracao;
import Enumerações.SistemaContratos.Entities.Trabalhador.Trabalhador;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Trabalhador funcionario = null;

        System.out.println("Ficha técnica do funcionário");
        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Escolha o nível do funcionário: ");
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Pleno");
        System.out.println("3 - Programador Sênior");
        System.out.print("Digite o número do nível do funcionário: ");
        int nivelFunc = scanner.nextInt();
        System.out.print("Digite o salário base desse funcionário: ");
        double salarioBase = scanner.nextDouble();
        if (nivelFunc == 1){
            funcionario = new Trabalhador(nomeFuncionario, Enumeracao.PROGRAMADORJUNIOR,salarioBase,"Programador Junior",new Departamento(nomeDepartamento));
            System.out.println(funcionario.fichaTecFunc());
        }

        else if (nivelFunc == 2) {
            funcionario = new Trabalhador(nomeFuncionario, Enumeracao.PROGRAMADORPLENO,salarioBase,"Programador Pleno",new Departamento(nomeDepartamento));
            System.out.println(funcionario.fichaTecFunc());
        }

        else if (nivelFunc == 3) {
            funcionario = new Trabalhador(nomeFuncionario, Enumeracao.PROGRAMADORSENIOR,salarioBase,"Programador Sênior",new Departamento(nomeDepartamento));
            System.out.println(funcionario.fichaTecFunc());
        }

        else {
            System.out.println("Esse nível não está disponível");
        }

        System.out.print("Digite o número de contratos para esse funcionário: ");
        int numContratos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numContratos; i++){

            System.out.print("Digite o tipo de contrato: ");
            String tipoContrato = scanner.nextLine();
            System.out.print("Digite o dia do mês que iniciou o contrato: ");
            int dia = scanner.nextInt();
            System.out.print("Digite o número do mês que iniciou o contrato: ");
            int mes = scanner.nextInt();
            System.out.print("Digite o ano que iniciou o contrato: ");
            int ano = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(ano, mes - 1, dia);
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
            calendar.set(Calendar.MILLISECOND,0);
            Date dataContrato = calendar.getTime();

            System.out.print("Digite o valor por hora de trabalho: ");
            Double valorHora = scanner.nextDouble();

            System.out.print("Digite quantas horas foram trabalhadas: ");
            Double quantHoras = scanner.nextDouble();
            System.out.println();
            Contratos contrato = new Contratos(tipoContrato,dataContrato,valorHora,quantHoras);
            if (funcionario != null){
                funcionario.adicionarContratos(contrato);
                System.out.println(funcionario.fichaTecCont());
            }
            scanner.nextLine();
        }
        System.out.println("Calculadora do valor total ganho pelo funcionário");
        System.out.print("Digite o mês do contrato: ");
        int mesContract = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o ano do contrato: ");
        int anoContract = scanner.nextInt();
        scanner.nextLine();

        if (funcionario != null){
            System.out.println("-------------------------------------------------------");
            System.out.println("Valor total dos contratos mais o salário base: "+funcionario.totalRenda(mesContract, anoContract));
            System.out.println("-------------------------------------------------------");
        }
        scanner.close();
    }
}
