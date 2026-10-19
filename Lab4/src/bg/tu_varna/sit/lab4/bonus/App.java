package bg.tu_varna.sit.lab4.bonus;

public class App {
    public static void main(String[] args) {
                Customer person = new Individual("Ivan");
                Customer company = new Company("ABC Ltd.");

                DepositAccount deposit =
                        new DepositAccount(person, 2000, 0.01);

                LoanAccount loan =
                        new LoanAccount(person, 10000, 0.02);

                MortgageAccount mortgage =
                        new MortgageAccount(company, 50000, 0.01);

                deposit.deposit(500);
                deposit.withdraw(200);

                loan.deposit(1000);
                mortgage.deposit(5000);

                System.out.println("Deposit interest: "
                        + deposit.calculateInterest(6));

                System.out.println("Loan interest: "
                        + loan.calculateInterest(6));

                System.out.println("Mortgage interest: "
                        + mortgage.calculateInterest(18));
            }
}
