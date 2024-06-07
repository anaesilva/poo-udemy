package com.poo.exception.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        try{
          if (balance < amount) {
              throw new "Withdraw limit: ";
          }
        } catch (Exception e) {
              e.getMessage();
        }
        balance -= amount;
    }
}
