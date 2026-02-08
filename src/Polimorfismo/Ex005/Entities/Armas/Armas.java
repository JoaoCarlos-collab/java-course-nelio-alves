package Polimorfismo.Ex005.Entities.Armas;

public class Armas implements Comparable <Armas>{
    private String nomeArma;
    private Double valorArma;

    public Armas() {}

    public Armas(String nomeArma, Double valorArma) {
        this.nomeArma = nomeArma;
        this.valorArma = valorArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public Double getValorArma() {
        return valorArma;
    }

    public void setValorArma(Double valorArma) {
        this.valorArma = valorArma;
    }

    @Override
    public String toString() {
        return  nomeArma + ", " +valorArma + "\n";
    }

    @Override
    public int compareTo(Armas valor) {
        return  - valorArma.compareTo(valor.getValorArma());
    }
}
