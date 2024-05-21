package com.poo.composition3.entities;

import com.poo.composition2.entities.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public double subtotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subtotal());
    }
}
