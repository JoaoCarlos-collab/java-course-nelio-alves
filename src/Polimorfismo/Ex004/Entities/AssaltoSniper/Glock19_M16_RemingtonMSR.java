package Polimorfismo.Ex004.Entities.AssaltoSniper;

import Polimorfismo.Ex004.Entities.ArmaBasica.Glock19;
import Polimorfismo.Ex004.Entities.ComboAssalto.Glock19_M16;
import Polimorfismo.Ex004.Entities.ComboAssalto.M16;
import Polimorfismo.Ex004.Entities.ComboSniper.Glock19_RemingtonMSR;
import Polimorfismo.Ex004.Entities.ComboSniper.RemingtonMSR;

public class Glock19_M16_RemingtonMSR extends Glock19 implements M16, RemingtonMSR {

    private Glock19_M16 glock19_M16 = new Glock19_M16();
    private Glock19_RemingtonMSR glock19_RemingtonMSR = new Glock19_RemingtonMSR();

    @Override
    public String gLock19Equipada() {
        return "GLOCK-19 EQUIPADA (DO COMBO \"ASSALTO/SNIPE\")";
    }

    @Override
    public String M16Equipada (){
        return glock19_M16.M16Equipada();
    }

    @Override
    public String RemingtonMSREquipada (){
        return glock19_RemingtonMSR.RemingtonMSREquipada();
    }

    public String Glock19_M16_RemingtonMSREquipadas(){
        return gLock19Equipada() + "\n" + M16Equipada() +"\n" + RemingtonMSREquipada() +"\n"+ "PRONTO PARA O COMBATE";
    }
}
