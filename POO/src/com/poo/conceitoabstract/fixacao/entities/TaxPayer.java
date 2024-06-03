package com.poo.conceitoabstract.fixacao.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class TaxPayer {
    private String name;
    private double anualIncome;

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public TaxPayer() {
    }

    public abstract double tax();
}
