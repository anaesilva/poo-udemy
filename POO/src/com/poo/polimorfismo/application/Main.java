package com.poo.polimorfismo.application;

import com.poo.polimorfismo.entities.Employee;
import com.poo.polimorfismo.entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Uma empresa possui funcionários próprios e terceirizados.
//                Para cada funcionário, deseja-se registrar nome, horas
//        trabalhadas e valor por hora. Funcionários terceirizado
//        possuem ainda uma despesa adicional.
//                O pagamento dos funcionários corresponde ao valor da hora
//        multiplicado pelas horas trabalhadas, sendo que os
//        funcionários terceirizados ainda recebem um bônus
//        correspondente a 110% de sua despesa adicional.
//                Fazer um programa para ler os dados de N funcionários (N
//                fornecido pelo usuário) e armazená-los em uma lista. Depois
//        de ler todos os dados, mostrar nome e pagamento de cada
//        funcionário na mesma ordem em que foram digitados.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> ls = new ArrayList<>();

        System.out.print("Enter the number of employees:? ");
        int n =  sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + "data:");
            System.out.print("Outsourced (y/n)?: ");
            char ans = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); //limpeza do buffer
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerhour = sc.nextDouble();

            if (ans == 'y') {
                System.out.print("Additional charge: ");
                double addiotinalCharge = sc.nextDouble();

                Employee employee = new OutSourceEmployee(name, hours, valuePerhour, addiotinalCharge);
                ls.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerhour);
                ls.add(employee);
            }
        }

    System.out.println("Payments: ");
    for (Employee employee : ls) {
        System.out.println(employee.toString());
    }

        sc.close();
    }
}
