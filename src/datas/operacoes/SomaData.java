package datas.operacoes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class SomaData {
    public static void main (String[] args){

        DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("-------------------------------------------------------");
        LocalDateTime dataHoraAtual = LocalDateTime.parse("12/01/2026 06:19",dataHoraFormatada);
        System.out.println("Data atual: "+dataHoraAtual.format(dataHoraFormatada));

        LocalDateTime novaDataHora = dataHoraAtual
                .minusYears(2)
                .minusMonths(3)
                .minusWeeks(2)
                .minusDays(10)
                .minusHours(3)
                .minusMinutes(30);
        System.out.println("Nova data: "+novaDataHora.format(dataHoraFormatada));
        System.out.println("-------------------------------------------------------");

        Instant horaUTC = Instant.now();


        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Data atual (UTC): "+formatoBR.format(horaUTC));

        Instant novaData = horaUTC.atZone(ZoneId.of("America/Sao_Paulo"))
                .plusDays(7)
                .plusMonths(1)
                .plusYears(1)
                .plusHours(10)
                .plusMinutes(30)
                .toInstant();

        System.out.println("Nova data (UTC): "+formatoBR.format(novaData));

        LocalDate data1 = horaUTC.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();
        LocalDate data2 = novaData.atZone(ZoneId.of("America/Sao_Paulo")).toLocalDate();

        Duration DiferencaData = Duration.between(horaUTC,novaData);
        System.out.println("Diferença entre as datas(UTC) em  dias: "+DiferencaData.toDays());
        System.out.println("Diferença entre as datas(UTC) em  horas: "+DiferencaData.toHours());
        System.out.println("Diferença entre as datas(UTC) em  minutos: "+DiferencaData.toMinutes());

        Period anoMes = Period.between(data1,data2);
        System.out.println("Diferença entre as datas(UTC) em anos: "+anoMes.getYears());
        System.out.println("Diferença entre as datas(UTC) em  meses: "+anoMes.getMonths());

        System.out.println("-------------------------------------------------------");
    }
}