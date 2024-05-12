package com.poo.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Conversao {
    public static void main(String[] args){
        //        Convertendo data-hora global para local

        LocalDate d1 = LocalDate.parse("2024-01-01");
        LocalDateTime d2 = LocalDateTime.parse("2024-01-01T11:00:26");
        Instant d3 = Instant.parse("2024-01-01T11:00:26Z");

        for (String x : ZoneId.getAvailableZoneIds()) {
            System.out.println("Especificacoes do time zone de vários paises" + x);
        }

        LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
        System.out.println("r1: " + r1);

        LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
        System.out.println("r2: " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
        System.out.println("r3: " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));
        System.out.println("r4: " + r4);
// Obter dados de uma data-hora local
    System.out.println("d1 dia = " + d1.getDayOfMonth());
    System.out.println("d1 mês = " + d1.getMonthValue());
    System.out.println("d1 ano = " + d1.getYear());

    System.out.println("d2 hora = " + d2.getHour());
    System.out.println("d2 minutos = " + d2.getMinute());

  }
}
