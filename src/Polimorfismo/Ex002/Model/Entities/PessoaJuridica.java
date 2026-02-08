package Polimorfismo.Ex002.Model.Entities;

import Polimorfismo.Ex002.Model.Exception.ValidationException;

import java.math.BigDecimal;

public class PessoaJuridica extends Pessoa {
    private int quantFunc;
    private String cnpj;

    public PessoaJuridica() {}

    public PessoaJuridica(String nomePess, String rendaAnual, int quantFunc, String cnpj) {
        super(nomePess, rendaAnual);
        setQuantFunc(quantFunc);
        setCnpj(cnpj);
    }

    public int getQuantFunc() {
        return quantFunc;
    }

    public void setQuantFunc(int quantFunc) {
        if (quantFunc >= 0){
            this.quantFunc = quantFunc;
        }

        else {
            throw new ValidationException("O número de funcionários está incorreto : "+quantFunc);
        }

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String cnpjLimpo = cnpj.replaceAll("[^0-9]","");

        if (cnpjLimpo.length() != 14){
            throw new ValidationException("O CNPJ está incorreto " +cnpjLimpo);
        }

        else {
            this.cnpj = cnpjLimpo;
        }
    }

    @Override
    public BigDecimal calcImpost(){
        BigDecimal numFunc = BigDecimal.valueOf(quantFunc);
        BigDecimal limiteFuncionarios = BigDecimal.valueOf(10);
        BigDecimal taxaMax = BigDecimal.valueOf(0.16);
        BigDecimal taxaMin = BigDecimal.valueOf(0.14);
        BigDecimal calcImpost = BigDecimal.ZERO;

        if(numFunc.compareTo(limiteFuncionarios) <= 0){
            calcImpost = getRendaAnual().multiply(taxaMax);
        }
        else {
            calcImpost = getRendaAnual().multiply(taxaMin);
        }
        return calcImpost;
    }

    @Override
    public String toString(){
        return  "-------------------------------"+
                "\nNome: "+getNomePess()+
                "\nRenda: "+getRendaAnual()+
                "\nQuantidade de funcionários: "+quantFunc+
                "\nCNPJ: "+cnpj+
                "\nImposto: : "+calcImpost() +
                "\n-------------------------------";
    }
}
