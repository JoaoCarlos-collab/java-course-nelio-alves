package Polimorfismo.Ex001.Model;
import java.math.BigDecimal;

public class Funcionario {
    private String nomeFunc;
    private Double valorHora;
    private Double horasTrab;

    public Funcionario() {
    }

    public Funcionario(String nomeFunc, Double valorHora, Double horasTrab) {
        this.nomeFunc = nomeFunc;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(Double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public BigDecimal pagamentoFunc(){
        return BigDecimal.valueOf(valorHora).multiply(BigDecimal.valueOf(horasTrab));
    }

    public BigDecimal adicional(){
        return BigDecimal.valueOf(0.0);
    }

    @Override
    public String toString() {
        return  "Nome: " + nomeFunc +
                "\nValor por hora: " + valorHora +
                "\nHoras trabalhadas: " + horasTrab +
                "\nAdicional: " + adicional() +
                "\nPagamento total: " + pagamentoFunc();
    }
}
