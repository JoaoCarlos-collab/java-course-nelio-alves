package Polimorfismo.Ex005.Report;
import Polimorfismo.Ex005.Entities.Armas.Armas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RelatorioArmas {
    private static String pathFolder;
    private static String pathFile;
    private static String path;
    private static File newFile;

    public RelatorioArmas() {}

    public static String getPathFolder() {
        return pathFolder;
    }

    public static void setPathFolder(String pathFolder) {
        RelatorioArmas.pathFolder = pathFolder;
    }

    public static String getPathFile() {
        return pathFile;
    }

    public static void setPathFile(String pathFile) {
        RelatorioArmas.pathFile = pathFile;
    }

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        RelatorioArmas.path = path;
    }

    public static void createPath (){
        if (pathFile != null && pathFolder != null){
            path = pathFolder + File.separator + pathFile;
            newFile = new File(path);
            System.out.println("Caminho criado");
            System.out.println(path);
        }

        else {
            System.out.println("Caminho incompleto");
        }
    }

    public static void createFile (){

        try {
            if (newFile.createNewFile()){
                System.out.println("Arquivo criado");
            }

            else {
                System.out.println("Arquivo não criado");
            }

        } catch (IOException e) {
            System.out.println("Erro no método createFile ()");
            e.printStackTrace();
        }
    }

    public static void createDoc(Armas armaPreco){
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(getPath(),true))){
            bfw.write(String.valueOf(armaPreco));
            bfw.newLine();
        } catch (IOException e) {
            System.out.println("Erro no método: public static void createDoc(String texto)");
        }
    }
}
