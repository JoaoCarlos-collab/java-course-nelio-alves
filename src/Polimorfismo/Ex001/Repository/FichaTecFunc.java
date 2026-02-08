package Polimorfismo.Ex001.Repository;

import Polimorfismo.Ex001.Model.Funcionario;

import java.util.ArrayList;

public class FichaTecFunc {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public FichaTecFunc() {
    }

    public void adicionarFunc (Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void exibirFunc(){
        System.out.println("-------------------------");
        System.out.println("Relatório de Funcionários");
        System.out.println("-------------------------");
        for (Funcionario f : funcionarios){
            System.out.println("-------------------------");
            System.out.println(f.toString());
            System.out.println("-------------------------");
        }
    }
}
