package com.poo.conceitoabstract.fixacao.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Individual() {
        super();
    }

    @Override
    public double tax() {
    double soma = 0;

    if (super.getAnualIncome() < 20000.00) {
        soma += ((super.getAnualIncome() * (15/100)) - (healthExpenditures * (50/100)));
    } else if (super.getAnualIncome() > 20000.00 && healthExpenditures == 2000.00) {
        soma += ((super.getAnualIncome() * (25/100)) - (healthExpenditures * (50/100)));
    }
        return soma;
    }

    @Override
    public String toString() {
        return super.getName() + ":" + " $" + tax();
    }
}
