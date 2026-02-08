package Polimorfismo.Ex002.Repository;

import Polimorfismo.Ex002.Model.Entities.Pessoa;

import java.util.ArrayList;

public class DataBase {

    private ArrayList<Pessoa> funcionarios = new ArrayList<>();

    public DataBase() {}

    public void adicionarFunc(Pessoa funcionario){
        funcionarios.add(funcionario);
    }

    public void exibirFunc(){
        for (Pessoa funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }
}
