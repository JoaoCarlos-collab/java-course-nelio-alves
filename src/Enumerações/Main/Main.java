package Enumerações.Main;

import Enumerações.Enums.OrdemStatus;
import Enumerações.Model.Ordem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main (String[] args){

        Ordem ordem = new Ordem(123, LocalDateTime.now(), OrdemStatus.AGUARDANDOPAGAMENTO);
        System.out.println(ordem);

        ordem.setStatus(OrdemStatus.PROCESSANDOPAGAMENTO);

        System.out.println(ordem);

        ordem.setStatus(OrdemStatus.PAGAMENTOREALIZADO);

        System.out.println(ordem);

        String envio = "ENVIADO";

        ordem.setStatus(OrdemStatus.valueOf(envio));

        System.out.println(ordem);

        String entrega = "ENTREGUE";

        ordem.setStatus(OrdemStatus.valueOf(entrega));

        System.out.println(ordem);

    }
}
