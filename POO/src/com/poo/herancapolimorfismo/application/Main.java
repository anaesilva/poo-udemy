package com.poo.herancapolimorfismo.application;

import com.poo.herancapolimorfismo.entities.ImportedProduct;
import com.poo.herancapolimorfismo.entities.Product;
import com.poo.herancapolimorfismo.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Fazer um programa para ler os dados de N
//        produtos (N fornecido pelo usuário). Ao final,
//        mostrar a etiqueta de preço de cada produto na
//        mesma ordem em que foram digitados.
//        Todo produto possui nome e preço. Produtos
//        importados possuem uma taxa de alfândega, e
//        produtos usados possuem data de fabricação.
//        Estes dados específicos devem ser
//        acrescentados na etiqueta de preço conforme
//        exemplo (próxima página). Para produtos
//        importados, a taxa e alfândega deve ser
//        acrescentada ao preço final do produto.
//                Favor implementar o programa conforme
//        projeto ao lado.

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        List<Product> ls = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n =  sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + "data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ans = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); //limpeza do buffer
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ans == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);

                ls.add(product);
            } else if (ans == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = simpleDateFormat.parse(sc.next());

                Product product = new UsedProduct(name, price, manufactureDate);

                ls.add(product);
            } else {
                Product product = new Product(name, price);
                ls.add(product);
            }
        }
//
//        System.out.println("PRICE TAGS: ");
//        for (Product product : ls) {
//            if (product instanceof ImportedProduct) {
//                System.out.println(product.getName() + " $" + String.format("%.2f", product.getPrice()) + " (Customs fee: $ " + String.format("%.2f", ((ImportedProduct) product).getCustomsFee()) + ")");
//            } else if(product instanceof UsedProduct) {
//                System.out.println(product.getName() + "(used) $" + String.format("%.2f", product.getPrice()) + " (Manufacture date: " + simpleDateFormat.format(((UsedProduct) product).getManufactureDate()) + ")");
//            } else {
//                System.out.println(product.getName() + " $" + String.format("%.2f", product.getPrice()));
//            }
//        }


        System.out.println("PRICE TAGS: ");
        for (Product product : ls) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
