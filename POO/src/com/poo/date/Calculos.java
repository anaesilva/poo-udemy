package com.poo.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args){
//        Tempo
        LocalDate d1 = LocalDate.parse("2024-01-01");
        LocalDateTime d2 = LocalDateTime.parse("2024-01-01T11:00:26");
        Instant d3 = Instant.parse("2024-01-01T11:00:26Z");

        LocalDate pastWeekLocalDate = d1.minusDays(7);
        System.out.println("Semana passada = " + pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d1.plusDays(7);
        System.out.println("Próxima semana = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
        System.out.println("Semana passada = " + pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d2.plusDays(7);
        System.out.println("Próxima semana = " + nextWeekLocalDateTime);

        Instant pastWeekLInstant = d3.minus(7, ChronoUnit.DAYS);
        System.out.println("Semana passada = " + pastWeekLInstant);

        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
        System.out.println("Próxima passada = " + nextWeekInstant);

//        Duração
//        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d1.atTime(0, 0));
//        System.out.println("t1 dias = " + t1.toDays());

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay());
        System.out.println("t1 dias = " + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d2);
        System.out.println("t2 dias = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekLInstant, d3);
        System.out.println("t3 dias = " + t3.toDays());
  }
}
