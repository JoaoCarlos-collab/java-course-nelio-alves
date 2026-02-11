package Generics.Ex004.Factory.ListaCaminhoServidor;
import Generics.Ex004.Docs.GerarCaminho.Caminho;
import Generics.Ex004.Entities.Usuario.Usuario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.nio.file.StandardOpenOption.APPEND;

public class Mapservidor {
    private static Map<String, List<Caminho>> mapaServidores = new TreeMap<>();

    public static void criarServidor(String nomeServidor, String servico){

        if (mapaServidores.containsKey(nomeServidor)){
            System.out.println("Este servidor "+nomeServidor+" está funcionando");
            List<Caminho> listaServico = mapaServidores.get(nomeServidor);

            for (Caminho servicos : listaServico){

                if (servicos.getNomeServico().equalsIgnoreCase(servico)){
                    System.out.println("Esse serviço "+servico+" já existe no servidor "+nomeServidor+", tente criar outro diferente");
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
                }
            }
            try {
                if (caminhoServico.createNewFile()){
                    System.out.println("O serviço "+servico+" foi adicionado ao servidor "+nomeServidor);
                }

            }catch (IOException e){
                System.out.println("O serviço "+servico+" não foi adicionado ao servidor "+nomeServidor);
            }
        }

        else {
            System.out.println("Este servidor ainda não existe, vamos criar agora !");
            List<Caminho> novosServicos = new ArrayList<>();
            novosServicos.add(new Caminho(nomeServidor, servico));
            mapaServidores.putIfAbsent(nomeServidor, novosServicos);

            Caminho caminho = new Caminho();
            File servidor = new File(caminho.getLocalServidor(),nomeServidor);

            if (!servidor.exists()){

                if (servidor.mkdirs()){
                    System.out.println("Servidor criado com sucesso: "+servidor);

                }

                else {
                    System.out.println("Servidor não foi criado");
                }
            }

            try {

                File servidorServico = new File(servidor, servico+".txt");

                if (servidorServico.createNewFile()){
                    System.out.println("Serviço criado: "+ servidorServico);
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
                Caminho caminhoGeral = new Caminho();
                Path caminhoServidorServico = Path.of(caminhoGeral.exibirCamiServi(), nomeServidor, nomeServico);

                try (BufferedWriter bfw = Files.newBufferedWriter(caminhoServidorServico, APPEND)){
                    bfw.write(String.valueOf(usuario));
                    bfw.newLine();
                    System.out.println("Usuário: "+ usuario.getNomeUsua());
                    System.out.println("Entrou no servidor: "+ nomeServico);
                    System.out.println("E acessou o serviço: "+ nomeServico);
                    System.out.println("No dia/hora: "+ usuario.getDataHora());
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
}