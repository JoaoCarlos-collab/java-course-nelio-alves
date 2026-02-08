package Generics.Ex004.Aplication;
import Generics.Ex004.Docs.GerarDoc.Doc;
import Generics.Ex004.Entities.Usuario.Usuario;

public class Main {
    public static void main (String[] args){

        //Criação do Arquivo
        Doc.setFolderPath("C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\src\\Generics\\Ex004\\Factory\\Registros");
        Doc.setFilePath("Lista003");
        Doc.setPath();
        Doc arquivo = new Doc();
        //arquivo.criandoArqui();

        //Criação do usuario
        Doc adiciUsuario = new Doc();
        Usuario p1 = new Usuario("Bombagi");
        //adiciUsuario.adicNoArquiv(p1);
        Doc lerArquivo = new Doc();
        lerArquivo.lerArquivo("C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\src\\Generics\\Ex004\\Factory\\Registros\\Lista003");
    }
}
