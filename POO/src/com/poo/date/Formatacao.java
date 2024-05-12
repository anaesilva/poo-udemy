package com.poo.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args){
//        Data-hora para Texto iso8601
//        Data-hora para formato customizado

        LocalDate d1 = LocalDate.parse("2024-01-01");
        LocalDateTime d2 = LocalDateTime.parse("2024-01-01T11:00:26");
        Instant d3 = Instant.parse("2024-01-01T11:00:26Z");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date1: " + d1.format(dateTimeFormatter));
        System.out.println("Date1: " + dateTimeFormatter.format(d1));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Date2: " + d2.format(dateTimeFormatter));
        System.out.println("Date2: " + d2.format(dateTimeFormatter2));

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Date3: " + dateTimeFormatter3.format(d3));

        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Date2: " + d2.format(dateTimeFormatter4));

    }
}
