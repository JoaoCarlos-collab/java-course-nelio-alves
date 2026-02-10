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
            System.out.println("Este servidor está funcionando");
            List<Caminho> listaServico = mapaServidores.get(nomeServidor);
            for (Caminho servicos : listaServico){
                if (servicos.getNomeServico().equalsIgnoreCase(servico)){
                    System.out.println("Esse serviço já existe, tente criar outro diferente");
                    return;
                }
            }

            List<Caminho> novoCaminho = new ArrayList<>();
            novoCaminho.add(new Caminho(nomeServidor, servico));
            mapaServidores.put(nomeServidor, novoCaminho);
        }
        else {
            System.out.println("Este servidor ainda não existe, vamos criar agora !");
            List<Caminho> novosServicos = new ArrayList<>();
            novosServicos.add(new Caminho(nomeServidor, servico));
            mapaServidores.putIfAbsent(nomeServidor, novosServicos);


            File servidor = new File(nomeServidor);

            boolean pasta = servidor.mkdirs();
            if (pasta){
                System.out.println("Pasta criada: "+ nomeServidor);
            }
            else {
                System.out.println("Pasta não criada");
            }

            File servico = new File();

            try {
                if (path.createNewFile()){
                    System.out.println("Arquivo criado: "+ path);
                }

                else {
                    System.out.println("Arquivo não criado");

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