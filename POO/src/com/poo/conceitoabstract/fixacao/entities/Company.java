package com.poo.conceitoabstract.fixacao.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company() {
        super();
    }

    @Override
    public double tax() {
        double soma = 0;

        if (numberOfEmployees > 10) {
            soma += ((super.getAnualIncome() * (14/100)));
        } else {
            soma += ((super.getAnualIncome() * (16/100)));
        }

        return soma;
    }
}
