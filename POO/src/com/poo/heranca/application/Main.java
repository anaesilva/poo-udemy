package com.poo.heranca.application;

import com.poo.heranca.entities.Account;
import com.poo.heranca.entities.BusinessAccount;
import com.poo.heranca.entities.SavingsAccount;

public class Main {
    public static void main(String[] args){
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3;
//        class heranca.entities.SavingsAccount cannot be cast to class heranca.entities.BusinessAccount (heranca.entities.SavingsAccount and heranca.entities.BusinessAccount are in unnamed module of loader 'app')
//        at heranca.application.Main.main(Main.java:23)

//        Se o que estiver na variável acc3 for um objeto BusinessAccount, aí pode fazer o casting
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

//        Sobreposição

        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc7.getBalance());

//      super
        Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}
