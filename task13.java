class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: +" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: -" + amount);
        } else {
            System.out.println("Withdrawal of " + amount + " rejected (Overdraft)!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class task13 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        // Simulate 5 mixed operations
        acc.deposit(1000.0);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(300.0);
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(500.0);
        System.out.println("Balance: " + acc.getBalance());

        acc.withdraw(1500.0); // Overdraft attempt
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(200.0);
        System.out.println("Balance: " + acc.getBalance());
    }
}