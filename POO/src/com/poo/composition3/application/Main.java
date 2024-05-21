package com.poo.composition3.application;

import com.poo.composition.entities.Department;
import com.poo.composition.entities.HourContract;
import com.poo.composition.entities.Worker;
import com.poo.composition.enums.WorkerLevel;
import com.poo.composition3.entities.Client;
import com.poo.composition3.entities.Order;
import com.poo.composition3.entities.OrderItem;
import com.poo.composition3.entities.Product;
import com.poo.composition3.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = simpleDateFormat.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter worker data: ");
        System.out.print("Status: ");
        String status = sc.next();

        System.out.print("How many items to this order? ");
        int n =  sc.nextInt();
        System.out.println();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " data:");
            System.out.print("Product name: ");
            sc.nextLine(); //limpeza do buffer
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

    System.out.println("ORDER SUMMARY: ");
    System.out.println(order);
  }
}
