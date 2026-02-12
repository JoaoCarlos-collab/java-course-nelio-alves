package Generics.Ex004.Factory.ServidorGeral;
import Generics.Ex004.Docs.GerarCaminho.Caminho;
import Generics.Ex004.Entities.Usuario.Usuario;
import Generics.Ex004.Factory.ListaGenerica.Lista;
import Generics.Ex004.Service.TimeSleep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mapservidor {
    private static Map<String, List<Caminho>> mapaServidores = new TreeMap<>();

    public static void criarServidor(String nomeServidor, String servico){

        if (mapaServidores.containsKey(nomeServidor)){
            System.out.println("Este servidor "+nomeServidor+" está funcionando");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            List<Caminho> listaServico = mapaServidores.get(nomeServidor);

            for (Caminho servicos : listaServico){

                if (servicos.getNomeServico().equalsIgnoreCase(servico)){
                    System.out.println("Esse serviço "+servico+" já existe no servidor "+nomeServidor+", tente criar outro diferente");
                    TimeSleep.esperar(2000);
                    return;
                }
            }

            listaServico.add(new Caminho(nomeServidor, servico));
            Caminho caminho = new Caminho();
            File caminhoServidor = new File(caminho.getLocalServidor(),nomeServidor);
            File caminhoServico = new File(caminhoServidor,servico + ".txt");

            if (!caminhoServidor.exists()){
                if (caminhoServidor.mkdirs()){
                    System.out.println("Este servidor tinha sido apagado e foi recriado");
                    TimeSleep.esperar(2000);
                }
            }
            try {
                if (caminhoServico.createNewFile()){
                    System.out.println("O serviço "+servico+" foi adicionado ao servidor "+nomeServidor);
                    TimeSleep.esperar(2000);
                }

            }catch (IOException e){
                System.out.println("O serviço "+servico+" não foi adicionado ao servidor "+nomeServidor);
            }
        }

        else {
            System.out.println("Este servidor ainda não existe, vamos criar agora !");
            TimeSleep.esperar(2000);
            List<Caminho> novosServicos = new ArrayList<>();
            novosServicos.add(new Caminho(nomeServidor, servico));
            mapaServidores.putIfAbsent(nomeServidor, novosServicos);

            Caminho caminho = new Caminho();
            File servidor = new File(caminho.getLocalServidor(),nomeServidor);

            if (!servidor.exists()){

                if (servidor.mkdirs()){
                    System.out.println("Servidor criado com sucesso: "+servidor);
                    TimeSleep.esperar(2000);

                }

                else {
                    System.out.println("Servidor não foi criado");
                }
            }

            try {

                File servidorServico = new File(servidor, servico+".txt");

                if (servidorServico.createNewFile()){
                    System.out.println("Serviço criado: "+ servidorServico);
                    TimeSleep.esperar(2000);
                }

                else {
                    System.out.println("Serviço não criado");

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void entrarServidor (String nomeServidor, String nomeServico, Usuario usuario){
        Caminho caminho = new Caminho();
        String caminhoBase = caminho.getLocalServidor();
        File caminhoServidor = new File(caminhoBase, nomeServidor);
        File caminhoServico = new File(caminhoServidor,nomeServico+".txt");

        if (caminhoServidor.exists()){

            if (caminhoServico.exists()){

                try (BufferedWriter bfw = new BufferedWriter(new FileWriter(caminhoServico, true))){
                    bfw.write(String.valueOf(usuario));
                    bfw.newLine();
                    System.out.println("Usuário: "+ usuario.getNomeUsua());
                    TimeSleep.esperar(1000);
                    System.out.println("Entrou no servidor: "+ nomeServidor);
                    TimeSleep.esperar(1000);
                    System.out.println("E acessou o serviço: "+ nomeServico);
                    TimeSleep.esperar(1000);
                    System.out.println("No dia/hora: "+ usuario.stringDataHora());
                    TimeSleep.esperar(1000);
                }

                catch (IOException e) {
                    System.out.println("Não foi possível entrar no servidor "+nomeServidor+" e no serviço "+nomeServico);
                }
            }

            else {
                System.out.println("Esse serviço "+nomeServico+" não existe");
            }

        }else {
            System.out.println("Esse servidor "+nomeServidor+" não existe");
        }
    }

    public static void relatorioAcesso(String nomeServidor, String nomeServico){
        Caminho caminho = new Caminho();
        String caminhoBase = caminho.getLocalServidor();
        File caminhoServidor = new File(caminhoBase, nomeServidor);
        File caminhoServico = new File(caminhoServidor,nomeServico+".txt");

        if (caminhoServidor.exists()){

            if (caminhoServico.exists()) {

                try (BufferedReader bfr = new BufferedReader(new FileReader(caminhoServico))){
                    Lista lista = new Lista();
                    String linha;

                    while ((linha = bfr.readLine()) != null){

                        if(!linha.trim().isEmpty()){
                            String [] vetor = linha.split(",");
                            lista.adcListaSet(vetor[0]);
                            lista.adcLista(linha);
                        }
                    }

                    System.out.println("Esses foram todos os acessos:");
                    lista.exiblista();
                    TimeSleep.esperar(1000);
                    System.out.println("------------------------------------------------");
                    System.out.println("Esses foram todas as pessoas que acessaram");
                    lista.exibListaSet();
                    TimeSleep.esperar(1000);

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}