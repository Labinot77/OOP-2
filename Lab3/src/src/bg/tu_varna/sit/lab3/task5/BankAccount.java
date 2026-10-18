package src.bg.tu_varna.sit.lab3.task5;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        if (this.balance >= 0) {
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance = this.balance + balance;
    }

    public void withdraw(double balance) {
        if (balance <= 0 || balance > this.balance) return;

        this.balance = this.balance - balance;
    }
}
