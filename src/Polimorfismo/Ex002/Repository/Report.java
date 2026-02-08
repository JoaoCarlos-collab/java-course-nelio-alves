package Polimorfismo.Ex002.Repository;
import Polimorfismo.Ex002.Model.Entities.Pessoa;
import Polimorfismo.Ex002.Model.Exception.ValidationIOException;

import java.io.*;

public class Report {
    private static String pathFolder;
    private static String pathFile;
    private static String path;
    private static File newFolder;

    public Report() {}

    public static void setPathFolder(String pathFolder) {
        Report.pathFolder = pathFolder;
    }

    public static void setPathFile(String pathFile) {
        Report.pathFile = pathFile;
    }

    public static String getPath() {
        return path;
    }

    public static void setPath()  {
        if(pathFolder != null && pathFile != null){
            path = pathFolder + File.separator + pathFile;

        }else {
            System.out.println("Caminho imcompleto");
        }


    }

    public static void setCriandoArquivo(){
        if (getPath() != null) {
            newFolder = new File(getPath());

            try {
                if (newFolder.createNewFile()){
                    System.out.println("Novo arquivo criado: "+getPath());
                }

            }catch (IOException e){
                System.out.println(e);
                e.printStackTrace();
            }

        }else {
            System.out.println("O caminho do arquivo está incompleto" +pathFolder + File.separator + pathFile);
        }
    }

    public static File getExibirArquivo(){
        return newFolder;
    }

    public static void setAdionarTexto(Pessoa texto){
        try (BufferedWriter adionarTexto = new BufferedWriter(new FileWriter(getPath(),true))){
            adionarTexto.write(String.valueOf(texto));
            adionarTexto.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
