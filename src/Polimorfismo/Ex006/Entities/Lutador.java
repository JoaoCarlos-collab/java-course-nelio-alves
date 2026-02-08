package Polimorfismo.Ex006.Entities;

public abstract class Lutador{
    private String nome;
    private String tipo = getClass().getSimpleName();

    public Lutador (){}
    public Lutador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public String horaDoCombate (){
        return "O " + getTipo() + " " + getNome() + " entrou no campo de batalha";
    }
}
