package com.poo.conceitoabstract.fixacao.application;

import com.poo.conceitoabstract.fixacao.entities.Company;
import com.poo.conceitoabstract.fixacao.entities.Individual;
import com.poo.conceitoabstract.fixacao.entities.TaxPayer;
import com.poo.herancapolimorfismo.entities.ImportedProduct;
import com.poo.herancapolimorfismo.entities.Product;
import com.poo.herancapolimorfismo.entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
//        podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
//                bem como o total de imposto arrecadado.
//        Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
//        são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
//        seguintes:
//        Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
//        renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
//                destes gastos são abatidos no imposto.
//                Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
//        fica: (50000 * 25%) - (2000 * 50%) = 11500.00
//        Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
//        funcionários, ela paga 14% de imposto.
//                Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
//        400000 * 14% = 56000.

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> ls = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n =  sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ans = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); //limpeza do buffer
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ans == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                ls.add(individual);
            } else if (ans == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                Company company = new Company(name, anualIncome, numberOfEmployees);

                ls.add(company);
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : ls) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
  }
}
