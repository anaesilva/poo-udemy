package com.poo.composition.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public double totalValue() {
        return valuePerHour * hours;
    }
}
