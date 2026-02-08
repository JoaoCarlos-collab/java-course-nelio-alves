package Polimorfismo.Ex002.Main;
import Polimorfismo.Ex002.Model.Entities.PessoaFisica;
import Polimorfismo.Ex002.Model.Entities.PessoaJuridica;
import Polimorfismo.Ex002.Model.Exception.ValidationException;
import Polimorfismo.Ex002.Repository.DataBase;
import Polimorfismo.Ex002.Repository.Report;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main (String[] args){
        DataBase dataBase = new DataBase();
        Scanner scanner = new Scanner(System.in);


        while (true){
            try {
                System.out.println("--------------------------------------------");
                System.out.println("Cálculo do imposto de renda ");
                System.out.println("1 - Pessoa Física");
                System.out.println("2 - Pessoa Pessoa jurídica");
                System.out.print("Digite o número da pessoas que você é: ");
                int tipoPes = scanner.nextInt();
                scanner.nextLine();
                System.out.println("--------------------------------------------");
                if (tipoPes == 1) {
                    try {
                        Report.setPathFolder("C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\src\\Polimorfismo\\Ex002\\Docs\\Report");
                        Report.setPathFile("Relatorio pessoas fisicas");
                        Report.setPath();
                        Report.setCriandoArquivo();
                        PessoaFisica pessoaFisica = new PessoaFisica();
                        System.out.print("Digite seu nome: ");
                        String nome = scanner.nextLine();
                        pessoaFisica.setNomePess(nome);
                        System.out.print("Digite o valor da sua renda anual: ");
                        String gastoAnual = scanner.nextLine();
                        pessoaFisica.setRendaAnual(gastoAnual);
                        System.out.print("Digite o valor do seu gasto com saúde anual: ");
                        String gastoSaude = scanner.nextLine();
                        pessoaFisica.setGastoSaude(gastoSaude);
                        System.out.print("Digite o número do seu CPF : ");
                        String cpf = scanner.nextLine();
                        pessoaFisica.setCpf(cpf);

                        dataBase.adicionarFunc(pessoaFisica);
                        dataBase.exibirFunc();
                        Report.setAdionarTexto(pessoaFisica);
                    }

                    catch (ValidationException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }

                else if (tipoPes == 2) {
                    try {
                        Report.setPathFolder("C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\src\\Polimorfismo\\Ex002\\Docs\\Report");
                        Report.setPathFile("Relatorio pessoas jurídicas");
                        Report.setPath();
                        Report.setCriandoArquivo();
                        PessoaJuridica pessoaJuridica = new PessoaJuridica();
                        System.out.print("Digite sua razão social: ");
                        String nome = scanner.nextLine();
                        pessoaJuridica.setNomePess(nome);
                        System.out.print("Digite o valor da sua renda anual: ");
                        String gastoAnual = scanner.nextLine();
                        pessoaJuridica.setRendaAnual(gastoAnual);
                        System.out.print("Digite a quantidade de funcionários: ");
                        int quantFunc = scanner.nextInt();
                        pessoaJuridica.setQuantFunc(quantFunc);
                        scanner.nextLine();
                        System.out.print("Digite o número do seu CNPJ: ");
                        String cnpj = scanner.nextLine();
                        pessoaJuridica.setCnpj(cnpj);

                        dataBase.adicionarFunc(pessoaJuridica);
                        dataBase.exibirFunc();
                        Report.setAdionarTexto(pessoaJuridica);
                    }

                    catch (ValidationException e) {
                        System.out.println("Erro: " + e.getMessage());

                    }
                }

                else {
                    System.out.println("Essa opção não existe");
                }

                System.out.println("--------------------------------------------");
                System.out.println("1 - Adicionar mais um funcionário");
                System.out.println("0 - Fechar programa");
                System.out.print("Digite o número da opção que deseja: ");
                int continuar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("--------------------------------------------");

                if (continuar == 1){
                    System.out.println("Adicionando um novo funcionário");
                }

                else {
                    System.out.println("Finalizando programa");
                    break;
                }

            }catch (InputMismatchException e){
                System.out.println("Erro");
                System.out.println(e);
            }
        }
        scanner.close();
    }
}
