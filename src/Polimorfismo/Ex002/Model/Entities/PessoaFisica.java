package Polimorfismo.Ex002.Model.Entities;

import Polimorfismo.Ex002.Model.Exception.ValidationException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PessoaFisica extends Pessoa {
    private BigDecimal gastoSaude;
    private String cpf;

    public PessoaFisica() {}

    public PessoaFisica(String nomePess, String rendaAnual, String gastoSaude, String cpf){
        super(nomePess,rendaAnual);
        setGastoSaude(gastoSaude);
        setCpf(cpf);
    }

    public BigDecimal getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(String gastoSaude) {

        if(gastoSaude.matches("[0-9]+([.,][0-9]+)?")){
            String valorLimpo = gastoSaude.replace(",",".");
            this.gastoSaude = new BigDecimal(valorLimpo);
        }

        else {
            throw new ValidationException("Digite apenas números no valor do seu gasto com saúde "+gastoSaude);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String cpfLimpo = cpf.replaceAll("[^0-9]","");

        if (cpfLimpo.length() != 11){
            throw new ValidationException("O CPF está incorreto "+cpf);
        }

        else {
            this.cpf = cpfLimpo;
        }
    }

    @Override
    public BigDecimal calcImpost(){
        BigDecimal calcImposto = BigDecimal.ZERO;
        BigDecimal limiteRend = BigDecimal.valueOf(20000);
        BigDecimal fator015 = BigDecimal.valueOf(0.15);
        BigDecimal fator025 = BigDecimal.valueOf(0.25);
        BigDecimal fator050 = BigDecimal.valueOf(0.50);

        if (getRendaAnual().compareTo(limiteRend) < 0){
            calcImposto = getRendaAnual().multiply(fator015);
        }

        else {
            calcImposto = getRendaAnual().multiply(fator025);
        }

        if (gastoSaude.compareTo(BigDecimal.ZERO) > 0){
            calcImposto = calcImposto.subtract(gastoSaude.multiply(fator050));

            if(calcImposto.compareTo(BigDecimal.ZERO) < 0){
                calcImposto = BigDecimal.ZERO;
            }
        }

        return calcImposto;
    }

    @Override
    public String toString(){
        return "-------------------------------"+
                "\nNome: "+getNomePess()+
                "\nRenda: "+getRendaAnual()+
                "\nGasto com saúde: "+gastoSaude+
                "\nCPF: "+cpf+
                "\nImposto: "+calcImpost().setScale(2, RoundingMode.HALF_UP) +
                "\n-------------------------------";
    }
}
