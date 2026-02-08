package Polimorfismo.Ex006.Entities;

public class Tanque extends Lutador implements CurtaDistancia{
    private String nome;

    public Tanque() {
    }

    public Tanque(String nome) {
        super(nome);
    }
}
