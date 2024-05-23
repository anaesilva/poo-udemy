package com.poo.polimorfismo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    protected Integer hours;
    protected Double valuePerhour;

    public double payment() {
        return hours * valuePerhour;
    }

    public String toString() {
        return name + " - $" + String.format("%.2f", payment());
    }
}
