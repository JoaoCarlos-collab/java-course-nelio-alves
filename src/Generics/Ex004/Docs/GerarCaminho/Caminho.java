package Generics.Ex004.Docs.GerarCaminho;

import java.io.File;

public class Caminho {
    private String nomeServidor;
    private String nomeServico;
    private final String localServidor = "C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\java-course-nelio-alves\\src\\Generics\\Ex004\\Docs";
    private String servidorCompleto;

    public Caminho(String nomeServidor, String nomeServico) {
        this.nomeServidor = nomeServidor;
        this.nomeServico = nomeServico;
        servidoServico();
    }

    public Caminho() {
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

    public void servidoServico(){

        File criandoServidor = new File(localServidor,nomeServidor);
        File criandoServico = new File(criandoServidor, nomeServico);
        this.servidorCompleto = String.valueOf(criandoServico);
    }

    public String exibirCamiServi(){
        return servidorCompleto;
    }
}
