package Polimorfismo.Ex002.Model.Entities;

import Polimorfismo.Ex002.Model.Exception.ValidationException;

import java.math.BigDecimal;

public abstract class Pessoa {
    private String nomePess;
    private BigDecimal rendaAnual;

    public Pessoa() {
    }

    public Pessoa(String nomePess, String rendaAnual) {
        this.nomePess = nomePess;
        setRendaAnual(rendaAnual);
    }

    public String getNomePess() {
        return nomePess;
    }

    public void setNomePess(String nomePess) {
        if(nomePess == null || nomePess.matches("[\\p{L} ]+")){
            this.nomePess = nomePess;
        }

        else {
            throw new ValidationException("Digite apenas letras no nome "+nomePess);
        }
    }

    public BigDecimal getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(String rendaAnual) {
        if(rendaAnual.matches("[0-9]+([.,][0-9]+)?")){
            String valorLimpo = rendaAnual.replace(",",".");
            this.rendaAnual = new BigDecimal(valorLimpo);
        }

        else {
            throw new ValidationException("Digite apenas números, e o valor não pode ser negativo "+rendaAnual);
        }
    }

    public abstract BigDecimal calcImpost();
}
