package Polimorfismo.Ex003.Model.Entities.TipoHabilidade;

public abstract class Habilidade {
    private String nomeHabilidade;
    private String tipoHabilidade;
    private String habilidadeLutador;

    public Habilidade(String nomeHabilidade, String tipoHabilidade, String habilidadeLutador) {
        this.nomeHabilidade = nomeHabilidade;
        this.tipoHabilidade = tipoHabilidade;
        this.habilidadeLutador = habilidadeLutador;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public String getTipoHabilidade() {
        return tipoHabilidade;
    }

    public void setTipoHabilidade(String tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }

    public String getHabilidadeLutador() {
        return habilidadeLutador;
    }

    public void setHabilidadeLutador(String habilidadeLutador) {
        this.habilidadeLutador = habilidadeLutador;
    }

    public abstract void efeitoHabilidade();


}
