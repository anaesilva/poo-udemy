package com.poo.herancapolimorfismo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {
        super();
    }

    @Override
    public String priceTag() {
      return super.getName() + " $" + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public double totalPrice() {
        return price + customsFee;
    }
}
