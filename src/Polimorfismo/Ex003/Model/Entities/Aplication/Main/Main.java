package Polimorfismo.Ex003.Model.Entities.Aplication.Main;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Barbaro.EspadaFogo;
import Polimorfismo.Ex003.Model.Entities.TipoArma.Barbaro.MachadoGlacial;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Barbaro.ArmaCritica;
import Polimorfismo.Ex003.Model.Entities.TipoHabilidade.Barbaro.GritoDeGuerra;
import Polimorfismo.Ex003.Model.Entities.TipoLutador.Guerreiro.Barbaro.Barbaro;


public class Main {
    public static void main(String[] args) {

        EspadaFogo espadaFogo = new EspadaFogo();
        ArmaCritica armaCritica = new ArmaCritica();
        Barbaro barbaro = new Barbaro(espadaFogo, armaCritica);
        System.out.println(barbaro.descricao());
        barbaro.falaUm();
        barbaro.andar();
        barbaro.falaDois();

        /*MachadoGlacial machadoGlacial = new MachadoGlacial();
        GritoDeGuerra GritoDeGuerra = new GritoDeGuerra();
        Barbaro barbaro = new Barbaro(machadoGlacial, GritoDeGuerra);
        System.out.println(barbaro.descricao());
        barbaro.falaUm();
        barbaro.andar();
        barbaro.falaDois();*/


    }
}