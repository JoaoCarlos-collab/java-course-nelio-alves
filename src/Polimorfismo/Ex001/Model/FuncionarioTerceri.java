package Polimorfismo.Ex001.Model;
import java.math.BigDecimal;

public class FuncionarioTerceri extends Funcionario{
    private BigDecimal valorAdicio;

    public FuncionarioTerceri() {
        super();
    }

    public FuncionarioTerceri(String nomeFunc, Double valorHora, Double horasTrab, BigDecimal valorAdicio) {
        super(nomeFunc, valorHora, horasTrab);
        this.valorAdicio = valorAdicio;
    }

    public BigDecimal getValorAdicio() {
        return valorAdicio;
    }

    public void setValorAdicio(BigDecimal valorAdicio) {
        this.valorAdicio = valorAdicio;
    }

    @Override
    public BigDecimal pagamentoFunc(){
        BigDecimal fator = new BigDecimal("0.1");
        return super.pagamentoFunc().add(valorAdicio.multiply(fator));
    }

    @Override
    public BigDecimal adicional(){
        return valorAdicio;
    }
}
