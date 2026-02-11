package Generics.Ex004.Factory.ListaCaminhoServidor;
import Generics.Ex004.Docs.GerarCaminho.Caminho;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public static String entrarServidor (String nomeServidor, String servico){
        String caminho = null;
        if (mapaServidores.containsKey(nomeServidor)){
            List <Caminho> servicos = mapaServidores.get(nomeServidor);

            for (Caminho c : servicos){
                if (c.getNomeServico().equalsIgnoreCase(servico)){
                    caminho = c.exibirCamiServi();
                }

                else {
                    System.out.println("Esse serviço não existe");
                }
            }
        }
        else {
            System.out.println("Esse servidor não existe");
        }
        return caminho;
    }
}