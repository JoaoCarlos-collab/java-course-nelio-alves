package Generics.Ex004.Docs.GerarCaminho;

import java.io.File;

public class Caminho {
    private String nomeServidor;
    private String nomeServico;
    private String localServidor;
    private String servidorCompleto;

    public Caminho(String nomeServidor, String nomeServico, String localServidor) {
        this.nomeServidor = nomeServidor;
        this.nomeServico = nomeServico;
        this.localServidor = localServidor;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getLocalServidor() {
        return localServidor;
    }

    public void setLocalServidor(String localServidor) {
        this.localServidor = localServidor;
    }

    public void servidoServico(){

        File criandoServidor = new File(localServidor,nomeServidor);
        File criandoServico = new File(criandoServidor, nomeServico);
        this.servidorCompleto = String.valueOf(criandoServico);
    }

}
