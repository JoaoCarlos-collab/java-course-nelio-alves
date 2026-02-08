package listas.aumentoSalario;

public class Pessoa {
    private static int contador = 0;
    private int id;
    private String nome;
    private double salario;

    public Pessoa(String nome, double salario) {
        contador++;
        this.id = contador;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void AumentarSalario(double percentual){
        this.salario *= ((percentual+100)/100);
    }
}
