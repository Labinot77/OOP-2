package bg.tu_varna.sit.lab4.bonus;

public class DepositAccount extends Account implements Withdrawable, Depositable{
    public DepositAccount(Customer customer, double balance, double monthlyInterest) {
        super(customer, balance, monthlyInterest);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(Math.max(0, getBalance() - amount));
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cant be 0");
        }

        setBalance(getBalance() + amount);
    }

    @Override
    public double calculateInterest(int months) {
        if (getBalance() > 0 && getBalance() < 1000) {
            return 0;
        };

        return getBalance() * getMontlyInterest() * months;
    };


}
