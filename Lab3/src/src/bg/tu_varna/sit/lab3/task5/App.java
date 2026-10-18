package src.bg.tu_varna.sit.lab3.task5;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Pavel", 10000);

        account.deposit(200);

        System.out.println(account.getBalance());

        account.withdraw(300);

        System.out.println(account.getBalance());
    }
}
