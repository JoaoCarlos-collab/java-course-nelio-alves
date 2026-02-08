package Polimorfismo.Ex005.Entities.Arsenal;

import Polimorfismo.Ex005.Entities.Armas.Armas;
import Polimorfismo.Ex005.Report.RelatorioArmas;

import javax.swing.text.AttributeSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeArmas {

    private ArrayList<Armas> listaDeArmas = new ArrayList<>();

    public ListaDeArmas() {}

    public void adcLista(){

        try (BufferedReader bfr = new BufferedReader(new FileReader(RelatorioArmas.getPath()))){
            String armaPreco = bfr.readLine();
            while (armaPreco != null){

                if (armaPreco.trim().isEmpty()){
                    armaPreco = bfr.readLine();
                    continue;
                }

                String[] armaPrecoFor = armaPreco.split(",");

                listaDeArmas.add(new Armas(armaPrecoFor [0], Double.parseDouble(armaPrecoFor[1])));
                armaPreco = bfr.readLine();
            }

        }catch (IOException e){
            System.out.println("Erro no método void adcLista()");
            e.printStackTrace();
        }

        Collections.sort(listaDeArmas);
        System.out.println("ARMAS, VALOR");
        for (Armas armas : listaDeArmas){
            System.out.println(armas.getNomeArma()+", "+armas.getValorArma());
        }
    }
}
