package Polimorfismo.Ex004.Aplication.Main;
import Polimorfismo.Ex004.Entities.ArmaBasica.Glock19;
import Polimorfismo.Ex004.Entities.AssaltoSniper.Glock19_M16_RemingtonMSR;
import Polimorfismo.Ex004.Entities.ComboAssalto.Glock19_M16;
import Polimorfismo.Ex004.Entities.ComboSniper.Glock19_RemingtonMSR;

public class Main {
    public static void main (String[] args){

        Glock19_M16_RemingtonMSR comboAssalto = new Glock19_M16_RemingtonMSR();
        System.out.println(comboAssalto.Glock19_M16_RemingtonMSREquipadas());

    }
}
