package com.poo.herancapolimorfismo.entities;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
public class UsedProduct extends Product {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct() {
        super();
    }

    @Override
    public String priceTag() {
      return super.getName() + " (used) $" + String.format("%.2f", price) + " (Manufacture date: " + simpleDateFormat.format(manufactureDate) + ")";
    }
}
