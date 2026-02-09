package Generics.Ex004.Docs.GerarDoc;
import Generics.Ex004.Entities.Usuario.Usuario;
import Generics.Ex004.Factory.ListaGenerica.Lista;

import java.io.*;

public class Doc {
    private String folderPath;
    private String filePath;
    private File path;


    public Doc() {
    }

    public Doc(String folderPath, String filePath) {
        this.folderPath = folderPath;
        this.filePath = filePath;
    }

    public File getFolderPath() {
        return new File(folderPath);
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public File getFilePath() {
        return new File(filePath);
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setPath(){
        path = new File(getFolderPath(), String.valueOf(getFilePath()));
    }

    public void criandoArqui(){

        if (!getFolderPath().exists()){
            boolean pasta = getFolderPath().mkdirs();
            if (pasta){
                System.out.println("Pasta criada: "+ getFolderPath());
            }

            else {
                System.out.println("Pasta não criada");
            }
        }

        else {
            System.out.println("A pasta: "+ getFolderPath());
            System.out.println("Já existe");
        }


        if (!path.exists()){
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

        else {
            System.out.println("O arquivo: "+ path);
            System.out.println("Já existe");
        }
    }

    public void adicNoArquiv(Usuario usuario) {
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(path, true))){
            bfw.write(String.valueOf(usuario));
            bfw.newLine();
            System.out.println(usuario.getNomeUsua()+" entrou no servidor");
            System.out.println(usuario.getDataHora());
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lerArquivo (String caminho){

        try (BufferedReader bfr = new BufferedReader(new FileReader(caminho))){
            Lista lista = new Lista();
            String linha;
            while ((linha = bfr.readLine()) != null){
                String [] vetor = linha.split(",");
                lista.adcListaSet(vetor[0]);
                lista.adcLista(linha);
            }

            lista.exiblista();
            lista.exibListaSet();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}