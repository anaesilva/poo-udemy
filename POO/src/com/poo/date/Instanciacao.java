package com.poo.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
    public static void main(String[] args){
//      Local date -> agora
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
//      Global date -> agora
        Instant d3 = Instant.now();

        System.out.println("Data: " + d1);
        System.out.println("Data: " + d2);
        System.out.println("Data: " + d3);

//      Texto iso8601
        LocalDate d4 = LocalDate.parse("2024-01-01");
        LocalDateTime d5 = LocalDateTime.parse("2024-01-01T11:00:26");
        Instant d6 = Instant.parse("2024-01-01T11:00:26Z");

        System.out.println("Data: " + d4);
        System.out.println("Data: " + d5);
        System.out.println("Data: " + d6);

//      Especificando um formato diferente do GMT
        Instant d7 = Instant.parse("2024-01-01T11:00:26-03:00");
        System.out.println("Data: " + d7);

//      Texto formato customizado
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d8 = LocalDate.parse("01/01/2024", dateTimeFormatter);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d9 = LocalDate.parse("01/01/2024 01:30", dateTimeFormatter2);

        System.out.println("Data: " + d8);
        System.out.println("Data: " + d9);

//      Dado isolado: dia, mês, ano
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("Data: " + d10);
        System.out.println("Data: " + d11);
  }
}
