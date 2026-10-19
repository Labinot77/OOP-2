package bg.tu_varna.sit.lab4.bonus;

public abstract class Account implements Depositable{
    private Customer customer;
    private double balance;
    private double monthlyInterestRate;

    public Account(Customer customer,double balance, double monthlyInterestRate) {
        this.customer = customer;
        this.balance = balance;
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public double getMontlyInterest() {
        return monthlyInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cant be 0");
        }

        balance += amount;
    }

    public abstract double calculateInterest(int months);
}
