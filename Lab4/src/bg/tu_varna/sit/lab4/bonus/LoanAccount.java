package bg.tu_varna.sit.lab4.bonus;

public class LoanAccount extends Account{
    private double paidAmount;

    public LoanAccount(Customer name, double balance, double interestRate) {
        super(name, balance, interestRate);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        paidAmount += amount;   // recorded, but the principal stays the same
    }

    public double getPaidAmount() {
        return paidAmount;
    }


    @Override
    public double calculateInterest(int months) {
        int freeMonths;

        if (getCustomer() instanceof Individual) {
            freeMonths = 3;
        } else {
            freeMonths = 2;
        }

        int interestMonths = Math.max(0, months - freeMonths);

        return getBalance() * getMontlyInterest() * interestMonths;
    }


}
