package bg.tu_varna.sit.lab4.bonus;

public class MortgageAccount extends Account{
    private double paidAmount;

    public MortgageAccount(Customer customer, double balance, double monthlyInterestRate) {
        super(customer, balance, monthlyInterestRate);
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
        double rate = getMontlyInterest();
        double balance = getBalance();

        if (getCustomer() instanceof Individual) {
            int interestMonths = Math.max(0, months - 6);
            return balance * rate * interestMonths;
        }
        // company
        return balance * rate * 0.5 * months;   // 50000 * 0.01 * 0.5 * 18 = 4500
    }
}
