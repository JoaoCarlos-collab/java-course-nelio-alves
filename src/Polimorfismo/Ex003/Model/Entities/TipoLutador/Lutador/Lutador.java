package Polimorfismo.Ex003.Model.Entities.TipoLutador.Lutador;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Arma;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Habilidade;

public abstract class Lutador {
    private String nome;
    private int HP;
    protected Arma arma;
    protected Habilidade habilidades;
    private String tipoLutador;

    public Lutador() {
    }

    public Lutador(String nome, int HP, Arma arma, Habilidade habilidades, String tipoLutador) {
        this.nome = nome;
        this.HP = HP;
        this.arma = arma;
        this.habilidades = habilidades;
        this.tipoLutador = tipoLutador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Habilidade getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidade habilidades) {
        this.habilidades = habilidades;
    }

    public String getTipoLutador() {
        return tipoLutador;
    }

    public void setTipoLutador(String tipoLutador) {
        this.tipoLutador = tipoLutador;
    }

    public abstract void andar();

    public abstract void falaUm();

    public abstract void falaDois();
}

