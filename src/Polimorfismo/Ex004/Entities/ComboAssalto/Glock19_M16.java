package Polimorfismo.Ex004.Entities.ComboAssalto;

import Polimorfismo.Ex004.Entities.ArmaBasica.Glock19;

public class Glock19_M16 extends Glock19 implements M16{


    @Override
    public String gLock19Equipada() {
        return "GLOCK-19 EQUIPADA";
    }

    @Override
    public String M16Equipada (){
        return "M16 EQUIPADA (DO COMBO \"ASSALTO\")";
    }

    public String Glock19_M16Equipadas(){
        return gLock19Equipada() + "\n" + M16Equipada() +"\n"+"PRONTO PARA O COMBATE";
    }
}
