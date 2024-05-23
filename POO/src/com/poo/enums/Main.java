package com.poo.enums;

import java.util.Date;

public class Main {
    public static void main(String[] args){
    Order order = new Order(1080, new Date(), OrderStatusEntity.PENDING_PAYMENT);
    System.out.println("Order: " + order);

        OrderStatusEntity os1 = OrderStatusEntity.DELIVERED;

        OrderStatusEntity os2 = OrderStatusEntity.valueOf("DELIVERED");

        System.out.println("Enum: " + os1);
        System.out.println("Conversão de String para enum: " + os2);
    }
}
