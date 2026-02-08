package datas.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex001 {
    public static void main (String[] args){



        System.out.println("------------------------------------------------------");

        DateTimeFormatter dTF01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime lDT01 = LocalDateTime.parse("12/01/2026 06:19",dTF01);
        System.out.println("Digitada: "+lDT01.format(dTF01));

        LocalDateTime lDT03 = LocalDateTime.now();
        System.out.println("Agora: "+lDT03.format(dTF01));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dTF02 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

        LocalDateTime lDT02 = LocalDateTime.parse("06:19 12/01/2026",dTF02);
        System.out.println("Digitada: "+lDT02.format(dTF02));

        LocalDateTime lDT04 = LocalDateTime.now();
        System.out.println("Agora: "+lDT04.format(dTF02));
        System.out.println("------------------------------------------------------");

        DateTimeFormatter dTF03 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate lD01 = LocalDate.parse("12/01/2026",dTF03);
        System.out.println("Digitada: "+lD01.format(dTF03));

        LocalDate lD02 = LocalDate.now();
        System.out.println("Agora: "+lD02.format(dTF03));

        System.out.println("------------------------------------------------------");
        DateTimeFormatter dTF04 = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime lT01 = LocalTime.parse("06:19",dTF04);
        System.out.println("Digitado: "+lT01.format(dTF04));

        LocalTime lT02 = LocalTime.now();
        System.out.println("Agora: "+lT02.format(dTF04));

        System.out.println("------------------------------------------------------");
        System.out.println("Digitada: "+lD01.format(dTF03)+" às "+lT01.format(dTF04));
        System.out.println("Agora: "+lD02.format(dTF03)+" às "+lT02.format(dTF04));
        System.out.println("------------------------------------------------------");

    }
}
