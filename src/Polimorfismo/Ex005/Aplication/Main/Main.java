package Polimorfismo.Ex005.Aplication.Main;

import Polimorfismo.Ex005.Entities.Armas.Armas;
import Polimorfismo.Ex005.Entities.Arsenal.ListaDeArmas;
import Polimorfismo.Ex005.Report.RelatorioArmas;

public class Main {
    public static void main (String[] args){

        RelatorioArmas.setPathFolder("C:\\Users\\jo029\\Desktop\\MeusCodigos\\Dominando_Javinha\\src\\Polimorfismo\\Ex005\\Report");
        RelatorioArmas.setPathFile("Relatorio de compras de armas");
        RelatorioArmas.createPath();
        RelatorioArmas.createFile();
        ListaDeArmas listaDeArmas = new ListaDeArmas();
        listaDeArmas.adcLista();

    }
}
