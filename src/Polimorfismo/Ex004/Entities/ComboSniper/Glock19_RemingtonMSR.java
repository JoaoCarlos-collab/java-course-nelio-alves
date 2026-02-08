package Polimorfismo.Ex004.Entities.ComboSniper;

import Polimorfismo.Ex004.Entities.ArmaBasica.Glock19;

public class Glock19_RemingtonMSR extends Glock19 implements RemingtonMSR{

    @Override
    public String gLock19Equipada() {
        return "GLOCK-19 EQUIPADA";

    }

    @Override
    public String RemingtonMSREquipada (){
        return "REMINGTONMSR EQUIPADA (DO COMBO \"SNIPER\")";
    }

    public String Glock19_RemingtonMSREquipadas(){
        return gLock19Equipada() + "\n" + RemingtonMSREquipada () +"\n"+"PRONTO PARA O COMBATE";
    }
}
