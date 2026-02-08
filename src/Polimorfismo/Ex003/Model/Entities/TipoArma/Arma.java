package Polimorfismo.Ex003.Model.Entities.TipoArma;

public abstract class Arma  {
    private String nomeArma;
    private String armaLutador;

    public Arma(String nomeArma, String armaLutador) {
        this.nomeArma = nomeArma;
        this.armaLutador = armaLutador;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public String getArmaLutador() {
        return armaLutador;
    }

    public void setArmaLutador(String armaLutador) {
        this.armaLutador = armaLutador;
    }

    public abstract String efeitoArma();

}
