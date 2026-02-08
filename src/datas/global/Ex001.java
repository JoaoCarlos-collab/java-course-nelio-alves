package datas.global;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex001 {
    public static void main (String[] args){

        Instant dataHoraUTC = Instant.now();

        System.out.println("------------------------------------------------------");
        DateTimeFormatter dHTF01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("UTC"));
        System.out.println("Data/Hora (UTC): "+dHTF01.format(dataHoraUTC));

        DateTimeFormatter dHTF02 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy").withZone(ZoneId.of("UTC"));
        System.out.println("Hora/Data (UTC): "+dHTF02.format(dataHoraUTC));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dTF01 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.of("UTC"));
        System.out.println("Data (UTC): "+dTF01.format(dataHoraUTC));

        DateTimeFormatter hTf01 = DateTimeFormatter.ofPattern("HH:mm").withZone(ZoneId.of("UTC"));
        System.out.println("Hora (UTC): "+hTf01.format(dataHoraUTC));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dHTF03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data/Hora (Brasília): "+dHTF03.format(dataHoraUTC));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dHTF04 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data (Brasília): "+dHTF04.format(dataHoraUTC));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dHTF05 = DateTimeFormatter.ofPattern("HH:mm").withZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Hora (Brasília): "+dHTF05.format(dataHoraUTC));
        System.out.println("------------------------------------------------------");
    }
}
