package com.poo.polimorfismo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutSourceEmployee extends Employee {
    private double addiotinalCharge;

    public OutSourceEmployee() {
        super();
    }

    public OutSourceEmployee(String name, Integer hours, Double valuePerhour, double addiotinalCharge) {
        super(name, hours, valuePerhour);
        this.addiotinalCharge = addiotinalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (1.1 * addiotinalCharge);
    }
}
